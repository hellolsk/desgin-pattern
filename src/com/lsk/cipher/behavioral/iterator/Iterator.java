package com.lsk.cipher.behavioral.iterator;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 20:01
 * @PackageName:21hj com.lsk.cipher.behavioral.iterator
 * @Description: 自己实现的迭代器接口，接收泛型
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
