package com.dubbo.exercise.messageListener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * Created by liusonglin
 * Date:2017/7/20
 * Description:
 */
@Slf4j
public class RedisMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] bytes) {
        log.info("message === {}",message);
        log.info("bytes === {}",new String(bytes));
    }
}
