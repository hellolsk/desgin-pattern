package com.lsk.cipher.creationalPatterns.singleton;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 13:14
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class HungryTest {
    public static void main(String[] args) {
        HungryStaticSingleton instance = HungryStaticSingleton.getInstance();
        System.out.println(instance);
    }
}
