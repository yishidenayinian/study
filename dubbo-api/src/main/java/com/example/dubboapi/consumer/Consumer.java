package com.example.dubboapi.consumer;

import com.example.dubboapi.service.ISay;
import com.example.dubboapi.zk.Param;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 18:21
 */
public class Consumer {
    public static void main(String[] args) {
        ReferenceConfig<ISay> refService = new ReferenceConfig<>();
        refService.setApplication(new ApplicationConfig(Param.PROVIDER_NAME));
        refService.setRegistry(new RegistryConfig(Param.ZK_ADDRESS));
        refService.setInterface(ISay.class);
        ISay ref = refService.get();
        String lzj = ref.test("lzj");
        System.out.println(lzj);

    }
}
