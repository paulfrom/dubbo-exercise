package com.dubbo.exercise.kafka.utils;

import kafka.admin.AdminUtils;
import kafka.admin.RackAwareMode;
import kafka.server.ConfigType;
import kafka.utils.ZkUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.security.JaasUtils;

import java.util.Properties;

/**
 * Created by liusonglin
 * Date:2017/7/24
 * Description:
 */
@Slf4j
public class TopicUtil {

    private TopicUtil(){}

    private static String host = "localhost:2181";

    public static boolean createTopic(String topic){
        ZkUtils zkUtils = ZkUtils.apply(host, 30000, 30000, JaasUtils.isZkSecurityEnabled());
        AdminUtils.createTopic(zkUtils, topic, 1, 1, new Properties(), RackAwareMode.Enforced$.MODULE$);
        zkUtils.close();
        return true;
    }

    public static boolean deleteTopic(String topic){
        ZkUtils zkUtils = ZkUtils.apply(host, 30000, 30000, JaasUtils.isZkSecurityEnabled());
        AdminUtils.deleteTopic(zkUtils,topic);
        zkUtils.close();
        return false;
    }

    public static boolean isTopicExist(String topic){
        ZkUtils zkUtils = ZkUtils.apply(host, 30000, 30000, JaasUtils.isZkSecurityEnabled());
        Properties properties = AdminUtils.fetchEntityConfig(zkUtils, ConfigType.Topic(),topic);
        if(properties != null){
            log.info("properties {}",properties);
            return true;
        }
        zkUtils.close();
        return false;
    }

//    public boolean editTopic(String oldTopic,String newTopic){
//
//    }
}
