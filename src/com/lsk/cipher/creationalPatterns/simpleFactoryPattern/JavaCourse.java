package com.lsk.cipher.creationalPatterns.simpleFactoryPattern;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 19:42
 * @PackageName:21hj com.lsk.creationalPatterns.simpleFactoryPattern
 * @Description:
 */
public class JavaCourse implements ICourse  {
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
