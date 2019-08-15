package com.matcher.top.it.service;

import com.matcher.top.it.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/10
 * @author: Wenxin
 * @version: 1.0
 */
@Component
public class DeptServiceFallBackFactory implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable cause) {
        return new DeptService() {
            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDName("fallback_02").setDbSource("fallback_02").setDName("fallback_02");
            }

            @Override
            public List<Dept> list() {
                return Arrays.asList(
                        new Dept().setDeptno(1L).setDName("fallback_02").setDbSource("fallback_02").setDName("fallback_02"),
                        new Dept().setDeptno(2L).setDName("fallback_02").setDbSource("fallback_02").setDName("fallback_02"),
                        new Dept().setDeptno(3L).setDName("fallback_02").setDbSource("fallback_02").setDName("fallback_02"),
                        new Dept().setDeptno(4L).setDName("fallback_02").setDbSource("fallback_02").setDName("fallback_02"),
                        new Dept().setDeptno(5L).setDName("fallback_02").setDbSource("fallback_02").setDName("fallback_02")
                );
            }

            @Override
            public Dept add(String dName, String dbSource, String description) {
                return new Dept().setDeptno(1L).setDName(dName).setDbSource(dbSource).setDName(description);
            }
        };
    }
}
