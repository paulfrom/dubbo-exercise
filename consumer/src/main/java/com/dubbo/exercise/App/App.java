//package com.dubbo.exercise.App;
//
//import com.dubbo.exercise.config.AppConfig;
//import com.dubbo.exercise.entity.Demo;
//import com.dubbo.exercise.entity.Other;
//import com.dubbo.exercise.service.DemoService;
//import com.dubbo.exercise.service.OtherService;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
///**
// * Created by liusonglin
// * Date:2017/7/6
// * Description:
// */
//public class App {
//
//
//
//    public static void main(String[] args){
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        DemoService demoService = (DemoService) applicationContext.getBean("demoService");
//
////        OtherService otherService = (OtherService) applicationContext.getBean("otherService");
//
//        System.out.println(demoService.queryDemoById(1));
//
//        Demo demo = new Demo();
//        demo.setAge(12);
//        demo.setMoney(12.12);
//        demo.setName("Amy");
//        System.out.println(demoService.insertDemo(demo));
//
////        Other other = new Other();
////        other.setOtherName("otherName");
////        other.setOtherThing("otherThing");
////
////        System.out.println(otherService.insertOther(other));
////
////
////        System.out.println(otherService.getOtherThing());
//    }
//}
