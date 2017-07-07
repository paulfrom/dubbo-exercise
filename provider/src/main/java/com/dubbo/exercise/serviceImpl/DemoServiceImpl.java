package com.dubbo.exercise.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.exercise.entity.Demo;
import com.dubbo.exercise.mapper.DemoMapper;
import com.dubbo.exercise.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Component
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoMapper demoMapper;

    @Value("${db.driver}")
    String driver;
    @Value("${db.url}")
    String url;
    @Value("${db.username}")
    String username;
    @Value("${db.password}")
    String password;

    @Override
    public Demo queryDemoById(int id){
        Demo demo = demoMapper.selectByPrimaryKey(id);
        System.out.println(driver);
        return demo;
    }

    @Override
    public int insertDemo(Demo demo) {
        return demoMapper.insert(demo);
    }
}
