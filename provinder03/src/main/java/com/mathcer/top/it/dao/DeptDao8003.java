package com.mathcer.top.it.dao;

import com.matcher.top.it.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.aop.support.DelegatePerTargetObjectIntroductionInterceptor;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeptDao8003 {

    public Dept get(Long id);

    public List<Dept> list();

    public boolean add(Dept dept);

}
