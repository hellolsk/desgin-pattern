package com.lsk.cipher.creationalPatterns.abstractFactory;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 10:17
 * @PackageName:21hj com.lsk.creationalPatterns.abstractFactory
 * @Description:
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("python笔记");
    }
}
