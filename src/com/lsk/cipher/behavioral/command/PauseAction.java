package com.lsk.cipher.behavioral.command;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 21:32
 * @PackageName:21hj com.lsk.cipher.behavioral.command
 * @Description:
 */
public class PauseAction implements IAction {
    private GPlayer gPlayer;

    public PauseAction(GPlayer gPlayer){
        this.gPlayer = gPlayer;
    }
    @Override
    public void execute() {
        gPlayer.pause();
    }
}
