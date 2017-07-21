package com.dubbo.exercise.zookeeper.producer;


import junit.framework.TestResult;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by liusonglin
 * Date:2017/7/21
 * Description:
 */
public class ProducerFactoryTest {

    private Properties props;


    @Before
    public void setUp(){
        props = new Properties();
        props.put("bootstrap.servers", "127.0.0.1:9092");
    }

    @Test
    protected void createResult() {
        Producer producer = ProducerFactory.getProducer(props);
        ProducerRecord producerRecord = new ProducerRecord("kafkatopic","keykey",props);
        Future<RecordMetadata> result = producer.send(producerRecord);
        try {
            Assert.assertEquals(result.get(),"kafkatopic");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        producer.close();
    }
}