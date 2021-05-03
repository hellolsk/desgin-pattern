package com.lsk.cipher.principle.lod;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 15:17
 * @PackageName:21hj com.lsk.principle.lod
 * @Description:
 */
public class Employee {
//
    /*public void checkNumberOfCourse(List<Course> courseList){
        System.out.println("课程量为："+courseList.size());
    }*/
//    员工和course打交道，而leader不需要，他只想得到统计结果
    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<>();
        System.out.println("课程量为："+courseList.size());
    }
}
