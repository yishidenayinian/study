package com.example.dubboconsumer.xml.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 17:34
 */
@Configuration
@ImportResource(locations = {"classpath:spring/dubbo-xml-consumer.xml"})
public class InitXmlConfig {

}
