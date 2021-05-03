package com.lsk.cipher.structualPatterns.flyweight;

/**
 * @Author:六月的雨
 * @Date:2021/2/14 11:06
 * @PackageName:21hj com.lsk.cipher.structualPatterns.flyweight
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ITicket iTicket = TicketFactory.queryTicket("杭州东", "重庆");
        iTicket.showInf();
        ITicket iTicket1 = TicketFactory.queryTicket("杭州东", "重庆北");
        iTicket1.showInf();
        ITicket iTicket2 = TicketFactory.queryTicket("杭州东", "重庆");
        iTicket2.showInf();
    }
}
