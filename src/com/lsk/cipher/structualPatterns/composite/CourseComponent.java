package com.lsk.cipher.structualPatterns.composite;

/**
 * @Author:六月的雨
 * @Date:2021/2/18 17:16
 * @PackageName:21hj com.lsk.cipher.structualPatterns.composite
 * @Description:
 */
public abstract class CourseComponent {
//    透明组合模式特点是将所有的操作都封装在公共组件中，使用抽象类这样子类就可以选择性重写方法。
    public void addChild(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持添加操作。");
    }
    public void removeChild(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持删除操作。");
    }
    public String getName(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持获取名称操作。");
    }
    public double getPrice(CourseComponent courseComponent){
        throw  new UnsupportedOperationException("不支持获取价格操作。");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印。");
    }
}
