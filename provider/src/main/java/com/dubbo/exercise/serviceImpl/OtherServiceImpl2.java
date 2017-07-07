package com.dubbo.exercise.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.exercise.entity.Other;
import com.dubbo.exercise.mapper.OtherMapper;
import com.dubbo.exercise.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liusonglin
 * Date:2017/7/7
 * Description:
 */
@Component
@Service(version = "2.0.0")
public class OtherServiceImpl2 implements OtherService {

    @Autowired
    private OtherMapper otherMapper;

    @Override
    public List<Other> getOtherThing() {
        return otherMapper.selectAll().subList(0,1);
    }

    @Override
    public int insertOther(Other other) {
        return otherMapper.insert(other);
    }
}
