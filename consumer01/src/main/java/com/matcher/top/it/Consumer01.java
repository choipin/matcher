package com.matcher.top.it;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/9
 * @author: Wenxin
 * @version: 1.0
 */
@SpringCloudApplication
public class Consumer01 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer01.class,args);
    }
}
