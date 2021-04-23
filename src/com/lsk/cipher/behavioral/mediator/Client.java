package com.lsk.cipher.behavioral.mediator;

/**
 * @Author:六月的雨
 * @Date:2021/3/19 09:50
 * @PackageName:21hj com.lsk.cipher.behavioral.mediator
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User alice = new User("alice",room);
        User bob = new User("bob",room);

        alice.sendMessage("hi,i am alice,bob!");
        bob.sendMessage("hi,this is bob!");
    }
}
