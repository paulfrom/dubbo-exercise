package com.dubbo.exercise.provider;

import com.dubbo.exercise.api.entity.Demo;
import com.dubbo.exercise.kafka.producer.TestProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Slf4j
public class ProviderLoad {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.dubbo.exercise.provider.config","com.dubbo.exercise.kafka.config");
        if(context != null && !"".equals(context.getId())){
            log.info("Service Start");
            System.in.read();
        }else {
            log.info("Service error");

        }
    }


}
