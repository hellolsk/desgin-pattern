package com.lsk.cipher.structualPatterns.brige;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 20:38
 * @PackageName:21hj com.lsk.cipher.structualPatterns.brige
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
//        测试组合功能
        NormalMessage normalMessage = new NormalMessage(new EmailMessage());
        normalMessage.sendMessage("加班","组长");

        UrgencyMessage urgencyMessage = new UrgencyMessage(new SmsMessage());
        urgencyMessage.sendMessage("线上bug","总监");
    }
}
