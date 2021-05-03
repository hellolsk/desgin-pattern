package com.lsk.cipher.principle.isp;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 12:21
 * @PackageName:21hj com.lsk.principle.isp
 * @Description:
 */
public class Bird implements IFlyAnimal,IEaTAnimal {

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void eat() {

    }
}
