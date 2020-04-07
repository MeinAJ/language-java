/*
 * Copyright (c) 2019, ABB and/or its affiliates. All rights reserved.
 * ABB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.anjun.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BaseEntity
 *
 * @author An Jun
 * @date 2020-04-06
 */
@Data
@TableName(value = "t_user")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    private String name;

    private String password;

    public UserEntity(String name) {
        this.name = name;
    }

}
