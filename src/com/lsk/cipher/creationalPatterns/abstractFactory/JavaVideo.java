package com.lsk.cipher.creationalPatterns.abstractFactory;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 10:20
 * @PackageName:21hj com.lsk.creationalPatterns.abstractFactory
 * @Description:
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("java视频");
    }
}
