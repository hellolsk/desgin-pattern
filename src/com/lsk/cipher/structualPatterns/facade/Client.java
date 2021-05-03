package com.lsk.cipher.structualPatterns.facade;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 20:41
 * @PackageName:21hj com.lsk.cipher.structualPatterns.facade
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Gift gift = new Gift("《设计模式》");
        GiftService giftService = new GiftService();
        giftService.exchange(gift);
    }
}
