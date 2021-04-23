package com.lsk.cipher.creationalPatterns.factoryPattern;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 21:36
 * @PackageName:21hj com.lsk.creationalPatterns.factoryPattern
 * @Description:
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
