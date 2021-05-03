package com.lsk.cipher.structualPatterns.flyweight;

import java.util.Random;

/**
 * @Author:六月的雨
 * @Date:2021/2/14 11:00
 * @PackageName:21hj com.lsk.cipher.structualPatterns.flyweight
 * @Description:
 */
public class TrainTicket implements ITicket {
    private String to;
    private String from;
    private int price;

    public TrainTicket(String to, String from) {
        this.to = to;
        this.from = from;
    }

    @Override
    public void showInf() {
        price = new Random().nextInt(500);
        System.out.println(String.format("%s->%s:%s",this.from,this.to,this.price));
    }
}
