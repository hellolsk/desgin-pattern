package com.lsk.cipher.structualPatterns.brige;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 20:35
 * @PackageName:21hj com.lsk.cipher.structualPatterns.brige
 * @Description:
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessage message) {
        super(message);
    }
    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage("加急"+message, toUser);
    }
//    支持扩展的其他方法，如对消息进度监控
    public Object watch(String messageId){
        return null;
    }
}
