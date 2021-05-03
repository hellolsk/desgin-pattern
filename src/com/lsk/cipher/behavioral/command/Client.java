package com.lsk.cipher.behavioral.command;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 21:48
 * @PackageName:21hj com.lsk.cipher.behavioral.command
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        GPlayer gPlayer = new GPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(gPlayer));
        controller.addAction(new PauseAction(gPlayer));
        controller.addAction(new StopAction(gPlayer));
        controller.executes();
    }
}
