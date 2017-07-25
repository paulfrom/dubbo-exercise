package com.dubbo.exercise.kafka.producer;

import com.dubbo.exercise.kafka.utils.TopicUtil;
import kafka.admin.AdminUtils;
import kafka.admin.RackAwareMode;
import kafka.utils.ZkUtils;
import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.security.JaasUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.Assert.*;

/**
 * Created by liusonglin
 * Date:2017/7/24
 * Description:
 */
@Slf4j
public class ProducerFactoryTest {

    private Properties props;


    @Before
    public void setUp(){
        props = new Properties();
        props.put("bootstrap.servers", "127.0.0.1:9092");
    }

    @Test
    public void testTemp() {
        log.info("Result1 {}",TopicUtil.createTopic("test2"));
        log.info("Result2 {}",TopicUtil.deleteTopic("kafkatopic"));
        log.info("Result3 {}",TopicUtil.isTopicExist("test1"));
    }

}