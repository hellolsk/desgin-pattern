package com.lsk.cipher.creationalPatterns.abstractFactory;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 10:13
 * @PackageName:21hj com.lsk.creationalPatterns.abstractFactory
 * @Description:
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
