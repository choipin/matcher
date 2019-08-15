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
 * @date: 2019/8/9
 * @author: Wenxin
 * @version: 1.0
 */
@Component
@FeignClient(value = "PROVINDER",fallbackFactory = DeptFeignFallBackFactory.class)
public interface DeptService {

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept consumerGet(@PathVariable("id")Long id);

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> consumerList();

    @RequestMapping(value = "/add/{dName}/{dbSource}/{description}",method = RequestMethod.GET)
    public Dept consumerAdd(@PathVariable("dName")String dName,@PathVariable("dbSource")String dbSource,@PathVariable("description")String description);
}
