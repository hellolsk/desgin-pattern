package com.lsk.cipher.behavioral.strategy;

/**
 * @Author:六月的雨
 * @Date:2021/3/11 21:51
 * @PackageName:21hj com.lsk.cipher.behavioral.stragey
 * @Description:
 */
public abstract class Payment {

    /**
     * 抽象方法，子类需要重写,获得实现类方法名称
     *
     * @return
     */
    public abstract String getName();

    public MsgResult pay(String uid, double amout) {
        if (queryBalance(uid) < amout) {
            return new MsgResult("余额不足！", 500, "支付失败！");
        }
        return new MsgResult("支付成功！", 200, "支付金额" + amout);
    }

    protected abstract double queryBalance(String uid);

}
