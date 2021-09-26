package com.example.dubboprovider.xml.impl;

import api.IConfigServer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 16:41
 */
public class ConfigServerImpl implements IConfigServer {
    @Override
    public String test(String name) {
        String pattern = "YYYY-MM-dd HH:mm:ss";
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
        System.out.println(name + "::"+ format + ":: say:: hello");
        return name + "::"+ format + ":: say:: hello";
    }
}
