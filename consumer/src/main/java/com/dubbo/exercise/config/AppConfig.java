package com.dubbo.exercise.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Configuration
@ComponentScan(basePackages = "com.dubbo.exercise",includeFilters={
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = com.alibaba.dubbo.config.annotation.Service.class)
})
@ImportResource("classpath:dubbo-services.xml")
public class AppConfig {
}
