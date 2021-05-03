package com.lsk.cipher.structualPatterns.brige;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 19:17
 * @PackageName:21hj com.lsk.cipher.structualPatterns.brige
 * @Description:
 */
public abstract class AbstractMessage {
    //持有一个对实现类接口的引用
    IMessage message;
//    构造函数，传入实现部分的对象
    public AbstractMessage(IMessage message){
        this.message = message;
    }
//    通过实现类发送消息
    public void sendMessage(String message,String toUser){
        this.message.send(message,toUser);
    }
}
