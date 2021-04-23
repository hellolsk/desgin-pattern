package com.lsk.cipher.behavioral.command;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 21:27
 * @PackageName:21hj com.lsk.cipher.behavioral.command
 * @Description:
 */
public class PlayAction implements IAction {
//    内部维护一个接收者对象
    private GPlayer gPlayer;

    public PlayAction(GPlayer gPlayer){
        this.gPlayer = gPlayer;
    }
    @Override
    public void execute() {
        gPlayer.play();
    }
}
