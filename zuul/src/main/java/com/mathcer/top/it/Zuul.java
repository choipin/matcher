package com.mathcer.top.it;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/10
 * @author: Wenxin
 * @version: 1.0
 */
@SpringCloudApplication
public class Zuul {
    public static void main(String[] args) {
        SpringApplication.run(Zuul.class,args);
    }
}
