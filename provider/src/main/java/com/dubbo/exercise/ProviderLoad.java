package com.dubbo.exercise;

import com.dubbo.exercise.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
public class ProviderLoad {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.dubbo.exercise.config");
//        DemoService demoService = (DemoService) context.getBean("demoService");
//        System.out.println(demoService.queryDemoById(1));
        System.out.println("Service Start");
        System.in.read();
    }
}
