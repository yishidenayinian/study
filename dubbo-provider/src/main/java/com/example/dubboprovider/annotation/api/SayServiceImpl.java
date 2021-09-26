package com.example.dubboprovider.annotation.api;

import api.ISayService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 10:53
 */
@DubboService
public class SayServiceImpl implements ISayService {
    @Override
    public String test(String name) {
        System.out.println("SayServiceImpl::reciver::"+name);
        return "hello::"+name;
    }
}
