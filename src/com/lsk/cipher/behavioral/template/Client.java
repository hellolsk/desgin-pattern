package com.lsk.cipher.behavioral.template;

/**
 * @Author:六月的雨
 * @Date:2021/3/2 15:37
 * @PackageName:21hj com.lsk.cipher.behavioral.template
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(true);
        javaCourse.createCourse();

        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
