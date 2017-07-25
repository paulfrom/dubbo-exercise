package com.dubbo.exercise.kafka.lisener;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by liusonglin
 * Date:2017/7/25
 * Description:
 */
@Component
@Slf4j
public class TestLisener {

    @KafkaListener(topics = {"testTopic"}, group = "testGroup")
    public void dealMessage(ConsumerRecord<?, ?> record){
        log.debug(JSON.toJSONString(record.value()));
        log.debug(JSON.toJSONString(record));

    }
}
