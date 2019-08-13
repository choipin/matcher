package com.matcher.top.it.dao;

import com.matcher.top.it.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/9
 * @author: Wenxin
 * @version: 1.0
 */
@Mapper
@Component
public interface DeptDao {
    public Dept get(Long id);

    public List<Dept> list();

    public boolean add(Dept dept);
}
