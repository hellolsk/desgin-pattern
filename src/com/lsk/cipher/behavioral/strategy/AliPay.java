package com.lsk.cipher.behavioral.strategy;

/**
 * @Author:六月的雨
 * @Date:2021/3/11 22:18
 * @PackageName:21hj com.lsk.cipher.behavioral.stragey
 * @Description:
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid){
        return 1000;
    }

}
