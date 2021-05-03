package com.lsk.cipher.behavioral.strategy;

/**
 * @Author:六月的雨
 * @Date:2021/3/11 22:29
 * @PackageName:21hj com.lsk.cipher.behavioral.stragey
 * @Description:
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    //    方法重载
    public MsgResult pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额" + amount + ",开始扣款");
        return payment.pay(uid, amount);
    }
}
