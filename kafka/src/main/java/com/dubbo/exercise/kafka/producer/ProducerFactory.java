package com.dubbo.exercise.kafka.producer;

import com.dubbo.exercise.kafka.serializer.JsonSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import java.util.Properties;

/**
 * Created by liusonglin
 * Date:2017/7/20
 * Description:
 */
public class ProducerFactory {

    private ProducerFactory(){}

    public static Producer getProducer(Properties config){
        return new KafkaProducer(setDefaultProperty(config));
    }

    private static Properties setDefaultProperty(Properties config){
        Properties properties = (Properties) config.clone();
        //配置value的序列化类
        properties.put("value.serializer", JsonSerializer.class);
        //配置key的序列化类
        properties.put("key.serializer", JsonSerializer.class);
        //超时时间
        properties.put("request.timeout.ms", "30000");

        return properties;
    }

}
