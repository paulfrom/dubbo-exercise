package com.dubbo.exercise.zookeeper.serializer;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by liusonglin
 * Date:2017/7/21
 * Description:
 */
@Slf4j
public class JsonSerializer implements Serializer<Object> {

    private String encoding = "UTF8";

    public void configure(Map<String, ?> configs, boolean isKey) {
        String propertyName = isKey?"key.serializer.encoding":"value.serializer.encoding";
        Object encodingValue = configs.get(propertyName);
        if(encodingValue == null) {
            encodingValue = configs.get("serializer.encoding");
        }

        if(encodingValue != null && encodingValue instanceof String) {
            this.encoding = (String)encodingValue;
        }
    }

    public byte[] serialize(String s, Object o) {
        if(o == null){
            return new byte[0];
        }
        try {
            return JSON.toJSONString(o).getBytes(this.encoding);
        } catch (UnsupportedEncodingException var4) {
            throw new SerializationException("Error when serializing string to byte[] due to unsupported encoding " + this.encoding);
        }
    }

    public void close() {
        //do nothing
    }

}
