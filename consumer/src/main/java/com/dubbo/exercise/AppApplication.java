package com.dubbo.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-services.xml")
@ComponentScan(basePackages = "com.dubbo.exercise",includeFilters={
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = com.alibaba.dubbo.config.annotation.Service.class)
})
@EnableAutoConfiguration
public class AppApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}