package com.anjun.springboot.service.impl;


import com.anjun.springboot.entity.BaseEntity;
import com.anjun.springboot.enums.BaseResponseEnum;
import com.anjun.springboot.service.BaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dataofx.base.exception.RRException;

public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

    /**
     * 检查是否为空
     *
     * @param entity 对象
     */
    @Override
    public void checkNull(T entity) {
        if (entity == null) {
            throw new RRException(BaseResponseEnum.NO_DATA);
        }
        if (entity instanceof BaseEntity) {
            BaseEntity baseEntity = (BaseEntity) entity;
            if (baseEntity.isDelete()) {
                throw new RRException(BaseResponseEnum.NO_DATA);
            }
        }

    }

    /**
     * 获取详情并验证为空
     *
     * @param entity 对象
     */
    @Override
    public T getOneAndCheckNull(T entity) {
        checkNull(entity);
        T one = getOne(new QueryWrapper<>(entity));
        checkNull(one);
        return one;
    }

}