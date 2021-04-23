package com.lsk.cipher.creationalPatterns.factoryPattern;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 21:34
 * @PackageName:21hj com.lsk.creationalPatterns.factoryPattern
 * @Description:
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("python课程");
    }
}
