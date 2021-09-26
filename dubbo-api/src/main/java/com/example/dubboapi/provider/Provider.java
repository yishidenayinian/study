package com.example.dubboapi.provider;

import com.example.dubboapi.service.ISay;
import com.example.dubboapi.service.impl.SayImpl;
import com.example.dubboapi.zk.Param;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.util.concurrent.CountDownLatch;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 18:03
 */
public class Provider {
    public static void main(String[] args) {
        ServiceConfig<ISay> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig(Param.PROVIDER_NAME));
        service.setRegistry(new RegistryConfig(Param.ZK_ADDRESS));
        service.setInterface(ISay.class);
        service.setRef(new SayImpl());
        service.export();

        System.out.println("dubbo service started");
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
