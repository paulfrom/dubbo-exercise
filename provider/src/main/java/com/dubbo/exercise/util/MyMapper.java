package com.dubbo.exercise.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
