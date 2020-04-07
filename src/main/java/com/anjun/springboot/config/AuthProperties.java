/**
 * dataofx.com Inc.
 * Copyright (c) 2019-2029 All Rights Reserved.
 */
package com.anjun.springboot.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "auth")
@Component
public class AuthProperties {

    private List<String> includeUrl;

    private List<String> excludeUrl;

}