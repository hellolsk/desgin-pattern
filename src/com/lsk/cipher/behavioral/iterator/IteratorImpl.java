package com.lsk.cipher.behavioral.iterator;

import java.util.List;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 20:05
 * @PackageName:21hj com.lsk.cipher.behavioral.iterator
 * @Description:
 */
public class IteratorImpl<E> implements Iterator<E> {
//    实现迭代器内部维护一个list，element,index
    private List<E> list;
    private int cursor;
    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

//    获取下一个元素
    @Override
    public E next() {
        System.out.print("当前位置: "+cursor);
        element = list.get(cursor);
        cursor++;
        return element;
    }

//    判断下一个位置是否有元素
    @Override
    public boolean hasNext() {
        return cursor > list.size()-1 ? false : true;
    }
}
