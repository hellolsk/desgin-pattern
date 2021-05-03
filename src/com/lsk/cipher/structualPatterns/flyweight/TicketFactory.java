package com.lsk.cipher.structualPatterns.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:六月的雨
 * @Date:2021/2/14 11:04
 * @PackageName:21hj com.lsk.cipher.structualPatterns.flyweight
 * @Description:
 */
public class TicketFactory {
    private static Map<String,ITicket> ticketPool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from,String to){
        String key = from +"->"+to;
        if(TicketFactory.ticketPool.containsKey(key)){
            System.out.println("使用缓存查询");
            return TicketFactory.ticketPool.get(key);
        }
        System.out.println("首次查询");
        TrainTicket trainTicket = new TrainTicket(from, to);
        TicketFactory.ticketPool.put(key,trainTicket);
        return trainTicket;
    }
}
