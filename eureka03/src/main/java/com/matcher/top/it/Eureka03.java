package com.matcher.top.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/10
 * @author: Wenxin
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka03 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka03.class,args);
    }
}
