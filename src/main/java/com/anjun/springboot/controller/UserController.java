/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.anjun.springboot.controller;

import com.anjun.springboot.model.LoginCondition;
import com.anjun.springboot.model.UserDTO;
import com.anjun.springboot.service.UserService;
import com.dataofx.base.model.CommonResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author An Jun
 * @date 2020-04-06
 */
@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户登录")
    @PostMapping(value = "/login")
    public CommonResult<UserDTO> login(@ApiParam(value = "登录名和密码") @RequestBody LoginCondition condition) {
        return CommonResult.ok(userService.login(condition));
    }

}
