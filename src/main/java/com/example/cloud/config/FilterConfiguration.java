package com.example.cloud.config;

import com.example.cloud.filter.PreZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Filter 配置类</p>
 *
 * @author sxy
 * @date 18-4-10
 * @since 1.0.0
 */
@Configuration
public class FilterConfiguration {
    @Bean
    public PreZuulFilter simpleFilter() {
        return new PreZuulFilter();
    }
}
