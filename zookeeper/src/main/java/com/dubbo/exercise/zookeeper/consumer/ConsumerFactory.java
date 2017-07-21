package com.dubbo.exercise.zookeeper.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Properties;
import java.util.UUID;

/**
 * Created by liusonglin
 * Date:2017/7/20
 * Description:
 */
@Slf4j
public class ConsumerFactory {

    private ConsumerFactory(){}


    public static KafkaConsumer<String,String> getConsumer(Properties properties){
        return new KafkaConsumer<String, String>(setDefaultProperty(properties));
    }


    private static Properties setDefaultProperty(Properties properties) {
        Properties props = (Properties) properties.clone();
        String uuid = UUID.randomUUID().toString();
        props.put("client.id", uuid);
        props.put("consumer.id", uuid);
        props.put("zookeeper.connection.timeout.ms", "60000");
        props.put("auto.commit.interval.ms", "10000");
        log.debug("consumer Properties:{}", props);
        return props;
    }
}
