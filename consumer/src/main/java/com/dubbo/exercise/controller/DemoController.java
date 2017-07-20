package com.dubbo.exercise.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.exercise.componet.WrapService;
import com.dubbo.exercise.entity.Demo;
import com.dubbo.exercise.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

   @Autowired
   WrapService wrapService;

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/index/{id}")
    public Demo index(@PathVariable("id")int id){
        redisTemplate.convertAndSend("my:consumer",id);
        if(demoService!=null){
            log.info("demo service is not null");
            Demo demo = new Demo();
            demo.setName("andy");
            demo.setMoney(32.90);
            demo.setAge(32);
            demoService.insertDemo(demo);
        }
        return wrapService.getDemoService().queryDemoById(id);
    }
}
