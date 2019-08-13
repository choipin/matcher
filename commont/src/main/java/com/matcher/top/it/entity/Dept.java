package com.matcher.top.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description:
 * @Project: matcher
 * @Date: 2019/8/8
 * @Author: Wenxin
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dName;
    private String dbSource;
    private String description;
}
