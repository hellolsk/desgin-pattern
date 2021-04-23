package com.lsk.cipher.structualPatterns.facade;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 20:35
 * @PackageName:21hj com.lsk.cipher.structualPatterns.facade
 * @Description:
 */
public class PaymentService {
    public boolean pay(Gift gift){
        System.out.println(gift.getName()+"支付成功");
        return true;
    }
}
