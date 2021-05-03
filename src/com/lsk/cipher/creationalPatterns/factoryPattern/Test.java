package com.lsk.cipher.creationalPatterns.factoryPattern;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 21:36
 * @PackageName:21hj com.lsk.creationalPatterns.factoryPattern
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse iCourse = javaCourseFactory.create();
        iCourse.record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse iCourse1 = pythonCourseFactory.create();
        iCourse1.record();
    }
}
