package com.lsk.cipher.creationalPatterns.singleton;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 17:45
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton(){
        if(LazyHolder.INSTANCE!=null){
            throw new RuntimeException("不允许构造两个实例！");
        }
    }
    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE =
                new LazyStaticInnerClassSingleton();
    }
}
