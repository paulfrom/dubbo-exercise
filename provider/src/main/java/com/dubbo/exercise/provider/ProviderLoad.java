package com.dubbo.exercise.provider;

import com.alibaba.dubbo.remoting.zookeeper.ZookeeperClient;
import com.dubbo.exercise.zookeeper.consumer.ConsumerFactory;
import com.dubbo.exercise.zookeeper.producer.ProducerFactory;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Slf4j
public class ProviderLoad {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.dubbo.exercise.config");
        if(context != null && !"".equals(context.getId())){
            log.info("Service Start");
            System.in.read();
        }else {
            log.info("Service error");

        }
    }


}
