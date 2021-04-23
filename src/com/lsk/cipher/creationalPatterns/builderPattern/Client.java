package com.lsk.cipher.creationalPatterns.builderPattern;

/**
 * @Author:六月的雨
 * @Date:2021/2/9 17:06
 * @PackageName:21hj com.lsk.cipher.creationalPatterns.builderPattern
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder();
        courseBuilder.addName("shejimoshi").addNote("xiaowang").addPpt("sheji").addVideo("10avi");
        System.out.println(courseBuilder.builder());
    }
}
