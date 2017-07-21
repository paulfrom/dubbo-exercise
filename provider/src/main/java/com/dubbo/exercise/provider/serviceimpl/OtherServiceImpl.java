package com.dubbo.exercise.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.exercise.api.entity.Other;
import com.dubbo.exercise.provider.mapper.OtherMapper;
import com.dubbo.exercise.api.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Component
@Service(version = "1.0.0")
public class OtherServiceImpl implements OtherService {

    @Autowired
    private OtherMapper otherMapper;

    @Override
    public List<Other> getOtherThing() {
        return otherMapper.selectAll();
    }

    @Override
    public int insertOther(Other other) {
        return otherMapper.insert(other);
    }
}
