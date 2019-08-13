package com.matcher.top.it.service.impl;

import com.matcher.top.it.dao.DeptDao;
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
    private DeptDao deptDao;
    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    @Transactional
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }
}
