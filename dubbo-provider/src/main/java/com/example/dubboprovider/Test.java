package com.example.dubboprovider;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.CountDownLatch;

/**
 * description
 *
 * @author erpang
 * date 2021/9/25 12:00
 */
@Component
public class Test {
    @PostConstruct
    public void init(){
        System.out.println("+++++++++++++provider++++++++++++++++");

        new Thread(()->{
            try {
                new CountDownLatch(1).await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
