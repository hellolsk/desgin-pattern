package com.lsk.cipher.creationalPatterns.abstractFactory;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 10:19
 * @PackageName:21hj com.lsk.creationalPatterns.abstractFactory
 * @Description:
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("python视频");
    }
}
