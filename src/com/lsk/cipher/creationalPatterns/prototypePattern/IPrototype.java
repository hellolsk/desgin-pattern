package com.lsk.cipher.creationalPatterns.prototypePattern;

/**
 * @Author:六月的雨
 * @Date:2021/2/8 17:01
 * @PackageName:21hj com.lsk.cipher.creationalPatterns.prototypePattern
 * @Description:
 */
public interface IPrototype<T> {
    T clone();
}
