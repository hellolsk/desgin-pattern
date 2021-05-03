package com.lsk.cipher.behavioral.strategy;

/**
 * @Author:六月的雨
 * @Date:2021/3/11 22:21
 * @PackageName:21hj com.lsk.cipher.behavioral.stragey
 * @Description:
 */
public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 200;
    }
}
