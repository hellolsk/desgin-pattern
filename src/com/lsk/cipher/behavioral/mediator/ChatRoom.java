package com.lsk.cipher.behavioral.mediator;

/**
 * @Author:六月的雨
 * @Date:2021/3/21 20:27
 * @PackageName:21hj com.lsk.cipher.behavioral.mediator
 * @Description:
 */
public class ChatRoom {
//    聊天室方法展示聊天用户和消息
    public void showMsg(User user,String msg){
        System.out.println("["+user.getName()+"]:"+msg);
    }
}
