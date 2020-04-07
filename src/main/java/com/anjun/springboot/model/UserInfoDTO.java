/**
 * dataofx.com Inc.
 * Copyright (c) 2020-2029 All Rights Reserved.
 */
package com.anjun.springboot.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

@Data
public class UserInfoDTO implements Serializable {

    @ApiModelProperty(value = "用户id")
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String name;

}