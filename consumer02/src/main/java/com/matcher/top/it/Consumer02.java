package com.matcher.top.it;

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
public class Consumer02 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer02.class,args);
    }
}
