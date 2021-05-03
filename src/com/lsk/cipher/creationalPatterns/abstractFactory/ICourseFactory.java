package com.lsk.cipher.creationalPatterns.abstractFactory;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 10:11
 * @PackageName:21hj com.lsk.creationalPatterns.abstractFactory
 * @Description:
 */
public interface ICourseFactory {
    INote createNote();
    IVideo createVideo();
}
