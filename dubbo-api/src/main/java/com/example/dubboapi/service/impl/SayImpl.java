package com.example.dubboapi.service.impl;

import com.example.dubboapi.service.ISay;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 18:15
 */
public class SayImpl implements ISay {
    @Override
    public String test(String name) {
        System.out.println("嘿嘿 " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "::" +name);
        return "嘿嘿 " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "::" +name;
    }
}
