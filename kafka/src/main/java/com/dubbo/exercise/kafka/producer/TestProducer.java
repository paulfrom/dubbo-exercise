package com.dubbo.exercise.kafka.producer;

import com.dubbo.exercise.api.entity.Demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;

/**
 * Created by liusonglin
 * Date:2017/7/25
 * Description:
 */
@Component
@Slf4j
public class TestProducer {

    @Autowired
    public KafkaTemplate kafkaTemplate;

    public void testSend(Demo demo){
        ListenableFuture<SendResult> temp = kafkaTemplate.send("testTopic", demo);
        try {
            log.info("info {}",temp.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
