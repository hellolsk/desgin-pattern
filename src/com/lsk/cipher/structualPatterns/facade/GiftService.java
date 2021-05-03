package com.lsk.cipher.structualPatterns.facade;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 20:38
 * @PackageName:21hj com.lsk.cipher.structualPatterns.facade
 * @Description:
 */
public class GiftService {
    private QualifyService qualifyService = new QualifyService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    public void exchange(Gift gift){
        if(qualifyService.isAvailable(gift)){
            if(paymentService.pay(gift)){
                shippingService.delivery(gift);
            }
        }
    }
}
