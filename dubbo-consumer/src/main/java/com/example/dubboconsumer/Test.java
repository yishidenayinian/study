package com.example.dubboconsumer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.CountDownLatch;

/**
 * description
 *
 * @author erpang
 * date 2021/9/25 12:02
 */
@Component
public class Test {
    @PostConstruct
    public void init(){
        System.out.println("+++++++++++consumer++++++++++++");
        new Thread(()->{
            try {
                new CountDownLatch(1).await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
