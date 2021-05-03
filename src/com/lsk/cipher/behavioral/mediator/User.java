package com.lsk.cipher.behavioral.mediator;

/**
 * @Author:六月的雨
 * @Date:2021/3/21 20:27
 * @PackageName:21hj com.lsk.cipher.behavioral.mediator
 * @Description:
 */
public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    //    用户直接和聊天室绑定了
    public void sendMessage(String msg) {
        this.chatRoom.showMsg(this, msg);
    }
}
