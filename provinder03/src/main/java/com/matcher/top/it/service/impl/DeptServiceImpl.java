package com.matcher.top.it.service.impl;

import com.matcher.top.it.entity.Dept;
import com.matcher.top.it.service.DeptService;
import com.matcher.top.it.dao.DeptDao8003;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/14
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao8003 deptDao8003;
    @Override
    public Dept get(Long id) {
        return deptDao8003.get(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao8003.list();
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao8003.add(dept);
    }
}
