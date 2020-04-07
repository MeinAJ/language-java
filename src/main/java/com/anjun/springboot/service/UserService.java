package com.anjun.springboot.service;

import com.anjun.springboot.entity.UserEntity;
import com.anjun.springboot.model.LoginCondition;
import com.anjun.springboot.model.UserDTO;
import javax.validation.Valid;

public interface UserService extends BaseService<UserEntity> {

    /**
     * 登录
     */
    UserDTO login(@Valid LoginCondition condition);

}
