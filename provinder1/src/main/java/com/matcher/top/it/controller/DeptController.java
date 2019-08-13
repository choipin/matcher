package com.matcher.top.it.controller;

import com.matcher.top.it.annotation.LoggerParam;
import com.matcher.top.it.entity.Dept;
import com.matcher.top.it.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/9
 * @author: Wenxin
 * @version: 1.0
 */
@RestController
@LoggerParam
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return deptService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @GetMapping("/add/{dName}/{dbSource}/{description}")
    public Dept add(@PathVariable("dName")String dName,@PathVariable("dbSource")String dbSource,@PathVariable("description")String description){
        Dept dept = new Dept().setDbSource(dbSource).setDName(dName).setDescription(description);
        deptService.add(dept);
        return dept;
    }
}
