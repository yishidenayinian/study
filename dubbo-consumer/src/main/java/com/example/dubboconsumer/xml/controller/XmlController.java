package com.example.dubboconsumer.xml.controller;

import api.IConfigServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 17:38
 */
@RestController
@RequestMapping("/xml")
public class XmlController {
    @Autowired
    private IConfigServer iConfigServer;

    @RequestMapping("test/{name}")
    @ResponseBody
    public String test(@PathVariable String name) {
        String test = iConfigServer.test(name);
        System.out.println("name::"+name+"::"+ test);
        return test;
    }
}
