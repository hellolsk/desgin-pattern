package com.lsk.cipher.creationalPatterns.singleton;

import java.lang.reflect.Constructor;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 19:48
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class InnerTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor<?> c = clazz.getDeclaredConstructor(null);
//            强制访问
            c.setAccessible(true);
//            强制初始化
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1==o2);//false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
