package com.example.dubboprovider.xml.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * description
 *
 * @author erpang
 * date 2021/9/26 17:03
 */
@Configuration
@ImportResource(locations={"classpath:spring/dubbo-xml-provider.xml"})
public class InitConfigParam {
}
