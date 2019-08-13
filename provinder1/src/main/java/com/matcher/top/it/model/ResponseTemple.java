package com.matcher.top.it.model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/9
 * @author: Wenxin
 * @version: 1.0
 */
@Data
@Accessors(chain = true)
public class ResponseTemple<T> implements Serializable {

    private int code;
    private String message;
    private T data;
    private Long timestamp;

    public ResponseTemple() {
        this.code = 200;
        this.message = "success";
        this.timestamp = System.currentTimeMillis();
    }
}
