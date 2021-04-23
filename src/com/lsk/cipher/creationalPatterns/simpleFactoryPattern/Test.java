package com.lsk.cipher.creationalPatterns.simpleFactoryPattern;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 19:51
 * @PackageName:21hj com.lsk.creationalPatterns.simpleFactoryPattern
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        CourseFactory courseFactory = new CourseFactory();
//        ICourse iCourse = courseFactory.create("java");
//        ICourse iCourse = courseFactory.create(
//                "com.lsk.creationalPatterns.simpleFactoryPattern.JavaCourse");
        ICourse iCourse = CourseFactory.create(JavaCourse.class);
        ICourse iCourse1 = CourseFactory.create(PythonCourse.class);
        iCourse1.record();
        iCourse.record();
    }
}
