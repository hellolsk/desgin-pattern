package com.lsk.cipher.creationalPatterns.abstractFactory;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 10:20
 * @PackageName:21hj com.lsk.creationalPatterns.abstractFactory
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote().edit();
        pythonCourseFactory.createVideo().record();
    }
}
