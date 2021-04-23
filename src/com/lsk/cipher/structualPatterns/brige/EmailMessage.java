package com.lsk.cipher.structualPatterns.brige;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 19:12
 * @PackageName:21hj com.lsk.cipher.structualPatterns.brige
 * @Description:
 */
public class EmailMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件发送"+message+"给"+toUser);
    }
}
