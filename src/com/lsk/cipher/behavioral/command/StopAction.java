package com.lsk.cipher.behavioral.command;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 21:33
 * @PackageName:21hj com.lsk.cipher.behavioral.command
 * @Description:
 */
public class StopAction implements IAction {
    private GPlayer gPlayer;

    public StopAction(GPlayer gPlayer){
        this.gPlayer = gPlayer;
    }
    @Override
    public void execute() {
        gPlayer.stop();
    }
}
