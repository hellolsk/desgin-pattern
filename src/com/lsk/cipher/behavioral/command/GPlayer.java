package com.lsk.cipher.behavioral.command;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 21:20
 * @PackageName:21hj com.lsk.cipher.behavioral.command
 * @Description:
 */
public class GPlayer {
//    这里模仿的是播放器内核我们的receiver，他能够直接执行相关指令
    public void play(){
        System.out.println("播放");
    }
    public void pause(){
        System.out.println("暂停");
    }
    public void stop(){
        System.out.println("停止");
    }
}
