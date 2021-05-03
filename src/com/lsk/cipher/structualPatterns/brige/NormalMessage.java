package com.lsk.cipher.structualPatterns.brige;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 20:10
 * @PackageName:21hj com.lsk.cipher.structualPatterns.brige
 * @Description:
 */
public class NormalMessage extends AbstractMessage {

    public NormalMessage(IMessage message) {
        super(message);
    }

//    普通消息直接调用父类方法发送
    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
