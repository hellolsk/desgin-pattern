package com.lsk.cipher.creationalPatterns.singleton;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 13:29
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class LazyTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+LazySimpleSingleton.getInstance());
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
