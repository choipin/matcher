package com.matcher.top.it.service.impl;

import com.matcher.top.it.dao.DeptDao8002;
import com.matcher.top.it.entity.Dept;
import com.matcher.top.it.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/10
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao8002 deptDao8002;
    @Override
    public Dept get(Long id) {
        return deptDao8002.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao8002.findAll();
    }

    @Override
    @Transactional
    public boolean add(Dept dept) {
        return deptDao8002.addDept(dept);
    }
}
