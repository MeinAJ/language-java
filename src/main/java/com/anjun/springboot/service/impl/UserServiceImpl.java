package com.anjun.springboot.service.impl;

import com.anjun.springboot.entity.UserEntity;
import com.anjun.springboot.enums.BaseResponseEnum;
import com.anjun.springboot.model.LoginCondition;
import com.anjun.springboot.model.UserDTO;
import com.anjun.springboot.repository.UserDao;
import com.anjun.springboot.service.UserService;
import com.dataofx.base.exception.RRException;
import org.springframework.stereotype.Service;
import javax.validation.Valid;

@Service(value = "userService")
public class UserServiceImpl extends BaseServiceImpl<UserDao, UserEntity> implements UserService {

    /**
     * 登录
     */
    @Override
    public UserDTO login(@Valid LoginCondition condition) {
        UserEntity detail = getOneAndCheckNull(new UserEntity(condition.getName()));
        checkPassword(detail.getPassword(), condition.getPassword());
        return new UserDTO(detail.getName(), "token");
    }

    private void checkPassword(String loginPassword, String dbPassword) {
        if (!loginPassword.equals(dbPassword)) {
            throw new RRException(BaseResponseEnum.PASSWORD_NOT_VALID);
        }
    }

}