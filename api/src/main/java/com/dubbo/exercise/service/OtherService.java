package com.dubbo.exercise.service;

import com.dubbo.exercise.entity.Other;

import java.util.List;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
public interface OtherService {

    List<Other> getOtherThing();

    int insertOther(Other other);
}
