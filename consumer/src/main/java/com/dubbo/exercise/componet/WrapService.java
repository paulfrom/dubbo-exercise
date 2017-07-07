package com.dubbo.exercise.componet;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.exercise.entity.Other;
import com.dubbo.exercise.service.DemoService;
import com.dubbo.exercise.service.OtherService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Component
public class WrapService {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @Reference(version = "1.0.0")
    private OtherService otherService;

    @Reference(version = "2.0.0")
    private OtherService otherService2;

    public DemoService getDemoService(){
        return demoService;
    }

    public OtherService getOtherService(){
        return otherService;
    }

    public OtherService getOtherService2(){
        return otherService2;
    }
}
