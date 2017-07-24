package com.dubbo.exercise.consumer;

import com.dubbo.exercise.api.entity.Demo;
import com.dubbo.exercise.api.entity.Other;
import com.dubbo.exercise.api.service.DemoService;
import com.dubbo.exercise.api.service.OtherService;
import com.dubbo.exercise.consumer.config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by liusonglin
 * Date:2017/7/21
 * Description:
 */
public class AppApplicationTest {

    @Test
    public void demoServiceTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoService demoService = (DemoService) applicationContext.getBean("demoService");

        OtherService otherService = (OtherService) applicationContext.getBean("otherService");

        System.out.println(demoService.queryDemoById(1));

        Demo demo = new Demo();
        demo.setAge(12);
        demo.setMoney(12.12);
        demo.setName("Amy");
        System.out.println(demoService.insertDemo(demo));

        Other other = new Other();
        other.setOtherName("otherName");
        other.setOtherThing("otherThing");

        System.out.println(otherService.insertOther(other));


        System.out.println(otherService.getOtherThing());
    }

}