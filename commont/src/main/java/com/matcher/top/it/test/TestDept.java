package com.matcher.top.it.test;

import com.matcher.top.it.entity.Dept;
import org.junit.Test;

/**
 * @Description:
 * @Project: matcher
 * @Date: 2019/8/8
 * @Author: Wenxin
 * @Version: 1.0
 */
public class TestDept {
    @Test
    public static void test(){
        Dept dept = new Dept();
        dept.setDbSource("serree");
        dept.setDName("name");
        dept.setDeptno(44L);
        System.out.println(dept);
    }

    public static void main(String[] args) {
        test();
    }

    @Test
    public void test1(){

    }
}
