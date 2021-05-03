package com.lsk.cipher.behavioral.strategy;

/**
 * @Author:六月的雨
 * @Date:2021/3/11 22:22
 * @PackageName:21hj com.lsk.cipher.behavioral.stragey
 * @Description:
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 600;
    }
}
