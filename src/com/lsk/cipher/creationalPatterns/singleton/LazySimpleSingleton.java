package com.lsk.cipher.creationalPatterns.singleton;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 13:25
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazy = null;

    public  static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazySimpleSingleton.class){
                if(lazy == null){
                    lazy = new LazySimpleSingleton();
                }
            }
        }
        return lazy;
    }
}
