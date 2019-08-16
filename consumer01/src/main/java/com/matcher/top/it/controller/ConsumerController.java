package com.matcher.top.it.controller;

import com.matcher.top.it.annotation.LoggerParam;
import com.matcher.top.it.entity.Dept;
import com.matcher.top.it.service.DeptService;
import lombok.extern.java.Log;
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
public class ConsumerController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/get/{id}")
    public Dept consumerGet(@PathVariable("id")Long id){
        return deptService.consumerGet(id);
    }

    @GetMapping("/list")
    public List<Dept> consumerList(){
        return deptService.consumerList();
    }

    @GetMapping("/add/{dName}/{dbSource}/{description}")
    public Dept consumerAdd(@PathVariable("dName")String dName,@PathVariable("dbSource")String dbSource,@PathVariable("description")String description){
        deptService.consumerAdd(dName,dbSource,description);
        return new Dept().setDName(dName).setDName(dbSource).setDescription(description);
    }
}
