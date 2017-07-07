package com.dubbo.exercise.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.exercise.componet.WrapService;
import com.dubbo.exercise.entity.Demo;
import com.dubbo.exercise.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

   @Autowired
   WrapService wrapService;

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("/index/{id}")
    public Demo index(@PathVariable("id")int id){
        if(demoService!=null){
            Demo demo = new Demo();
            demo.setName("andy");
            demo.setMoney(32.90);
            demo.setAge(32);
            demoService.insertDemo(demo);
        }
        return wrapService.getDemoService().queryDemoById(id);
    }
}
