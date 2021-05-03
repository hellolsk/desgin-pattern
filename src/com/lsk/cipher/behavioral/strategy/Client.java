package com.lsk.cipher.behavioral.strategy;

/**
 * @Author:六月的雨
 * @Date:2021/3/11 21:50
 * @PackageName:21hj com.lsk.cipher.behavioral.stragey
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order("1", "202103110007", 666);
//        通过构造方法抽象策略管理context灵活选择具体策略
        System.out.println(order.pay(PayStrategy.WECHAT_PAY));
    }
}
