package com.dubbo.exercise.service;

import com.dubbo.exercise.entity.Demo;

/**
 * Created by liusonglin
 * Date:2017/7/5
 * Description:
 */
public interface DemoService{

    Demo queryDemoById(int id);

    int insertDemo(Demo demo);
}