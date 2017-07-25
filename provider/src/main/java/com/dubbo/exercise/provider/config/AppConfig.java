package com.dubbo.exercise.provider.config;

import org.springframework.context.annotation.*;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Configuration
@ComponentScan({"com.dubbo.exercise.provider.serviceimpl","com.dubbo.exercise.kafka"})
@ImportResource("classpath:dubbo-provide.xml")
public class AppConfig {
}
