package com.dubbo.exercise.consumer.controller;

import com.dubbo.exercise.api.entity.Other;
import com.dubbo.exercise.consumer.componet.WrapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@RestController
@RequestMapping("/other")
public class OtherController {

    @Resource
    private WrapService wrapService;


    @GetMapping("/index")
    public List<Other> index(){
        return wrapService.getOtherService().getOtherThing();
    }

    @GetMapping("/index2")
    public List<Other> index2(){
        return wrapService.getOtherService2().getOtherThing();
    }

    @PostMapping("/add")
    public int addOther(Other other){
        return wrapService.getOtherService().insertOther(other);
    }
}
