package com.matcher.top.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/10
 * @author: Wenxin
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class Config {
    public static void main(String[] args) {
        SpringApplication.run(Config.class,args);
    }
}
