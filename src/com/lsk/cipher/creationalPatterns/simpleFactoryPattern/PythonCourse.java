package com.lsk.cipher.creationalPatterns.simpleFactoryPattern;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 19:44
 * @PackageName:21hj com.lsk.creationalPatterns.simpleFactoryPattern
 * @Description:
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制python课程");
    }
}
