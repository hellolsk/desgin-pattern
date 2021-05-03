package com.lsk.cipher.structualPatterns.flyweight;

/**
 * @Author:六月的雨
 * @Date:2021/2/14 11:23
 * @PackageName:21hj com.lsk.cipher.structualPatterns.flyweight
 * @Description:
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        System.out.println("a==b "+ (a.equals(b)));
        System.out.println("c==d "+ (c.equals(d)));
    }
}
