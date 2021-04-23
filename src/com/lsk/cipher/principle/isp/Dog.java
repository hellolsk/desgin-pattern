package com.lsk.cipher.principle.isp;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 12:22
 * @PackageName:21hj com.lsk.principle.isp
 * @Description:
 */
public class Dog implements IEaTAnimal,ISwimAnimal {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
