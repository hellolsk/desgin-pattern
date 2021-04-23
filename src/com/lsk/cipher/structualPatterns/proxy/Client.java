package com.lsk.cipher.structualPatterns.proxy;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 14:19
 * @PackageName:21hj com.lsk.cipher.structualPatterns.proxy
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
//        Father father = new Father(new Son());
//        father.findGirls();
        JDKMeipo jdkMeipo = new JDKMeipo();
        IPerson son = jdkMeipo.getInstance(new Son());
        son.findGirls();

    }
}
