package com.example.dubboapi.zk;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 18:04
 */
public  class Param {
    /*public static final String ZK_ADDRESS = "192.168.192.112:2181,192.168.192.113:2181,192.168.192.114:2181,192.168" +
            ".192.115:2181/dubbo";*/
    public static final String ZK_ADDRESS = "zookeeper://" + "192.168.192.112:2181,192.168.192.113:2181,192.168.192.114:2181,192.168" +
            ".192.115:2181/dubbo";
    public static final String CONSUMER_NAME = "dubbo-consumer";
    public static final String PROVIDER_NAME = "dubbo-provider";

}
