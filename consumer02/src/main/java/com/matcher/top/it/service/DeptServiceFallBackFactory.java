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
                return new Dept().setDeptno(id).setDName("02_dname_02").setDbSource("02_dbSource_02").setDName("02_description_02");
            }

            @Override
            public List<Dept> list() {
                return Arrays.asList(
                        new Dept().setDeptno(1L).setDName("02_dname_01").setDbSource("02_dbSource_01").setDName("02_description_01"),
                        new Dept().setDeptno(2L).setDName("02_dname_02").setDbSource("02_dbSource_02").setDName("02_description_02"),
                        new Dept().setDeptno(3L).setDName("02_dname_03").setDbSource("02_dbSource_03").setDName("02_description_03"),
                        new Dept().setDeptno(4L).setDName("02_dname_04").setDbSource("02_dbSource_04").setDName("02_description_04"),
                        new Dept().setDeptno(5L).setDName("02_dname_05").setDbSource("02_dbSource_05").setDName("02_description_05")
                );
            }

            @Override
            public Dept add(String dName, String dbSource, String description) {
                return new Dept().setDeptno(1L).setDName(dName).setDbSource(dbSource).setDName(description);
            }
        };
    }
}
