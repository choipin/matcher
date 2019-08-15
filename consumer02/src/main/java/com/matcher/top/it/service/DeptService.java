package com.matcher.top.it.service;

import com.matcher.top.it.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/10
 * @author: Wenxin
 * @version: 1.0
 */
@Component
@FeignClient(value = "PROVINDER",fallbackFactory = DeptServiceFallBackFactory.class)
public interface DeptService {

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id")Long id);

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/add/{dName}/{dbSource}/{description}",method = RequestMethod.GET)
    public Dept add(@PathVariable("dName")String dName,@PathVariable("dbSource")String dbSource,@PathVariable("description")String description);
}
