package com.dubbo.exercise.config;

import org.springframework.context.annotation.*;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Configuration
@ComponentScan("com.dubbo.exercise.serviceImpl")
@ImportResource("classpath:dubbo-provide.xml")
public class AppConfig {
}
