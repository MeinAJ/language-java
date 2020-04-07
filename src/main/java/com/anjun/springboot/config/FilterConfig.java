

package com.anjun.springboot.config;

import com.anjun.springboot.filter.CrosFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import javax.servlet.Filter;

@Configuration
public class FilterConfig {

    @Bean
    @Order(1)
    public Filter filter() {
        return new CrosFilter();
    }

}
