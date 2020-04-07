package com.anjun.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;

public interface BaseService<T> extends IService<T> {

    /**
     * 检查是否为空
     *
     * @param entity 对象
     */
    void checkNull(T entity);

    /**
     * 获取详情并验证为空
     *
     * @param entity 对象
     */
    T getOneAndCheckNull(T entity);

}
