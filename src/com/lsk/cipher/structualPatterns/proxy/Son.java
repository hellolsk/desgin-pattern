package com.lsk.cipher.structualPatterns.proxy;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 14:16
 * @PackageName:21hj com.lsk.cipher.structualPatterns.proxy
 * @Description:
 */
public class Son implements IPerson {
    @Override
    public void findGirls() {
        System.out.println("相亲！");
    }
}
