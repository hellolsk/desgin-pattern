package com.lsk.cipher.structualPatterns.brige;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 19:15
 * @PackageName:21hj com.lsk.cipher.structualPatterns.brige
 * @Description:
 */
public class SmsMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信发送"+message+"给"+toUser);
    }
}
