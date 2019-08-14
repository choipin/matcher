package com.mathcer.top.it.service;

import com.matcher.top.it.entity.Dept;

import java.util.List;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/14
 * @author: Wenxin
 * @version: 1.0
 */
public interface DeptService {
    public Dept get(Long id);

    public List<Dept> list();

    public boolean add(Dept dept);
}
