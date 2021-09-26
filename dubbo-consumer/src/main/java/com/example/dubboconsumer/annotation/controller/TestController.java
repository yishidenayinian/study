package com.example.dubboconsumer.annotation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 14:22
 */
@RestController
@RequestMapping("/dubbo")
public class TestController {

   /* @Autowired
    private ISayService iSayService;

    @RequestMapping("say/{name}/{sex}")
    @ResponseBody
    public String say(@PathVariable(value = "name") String name,@PathVariable("sex") String sex){
        String test = iSayService.test(name);
        String ss = "man".equals(sex) ? "男士" : "女士";
        System.out.println("say::"+test+"::您的性别为："+ ss);
        return test+ss;
    }*/
}
