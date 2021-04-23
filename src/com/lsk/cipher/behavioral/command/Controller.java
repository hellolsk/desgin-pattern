package com.lsk.cipher.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 21:34
 * @PackageName:21hj com.lsk.cipher.behavioral.command
 * @Description:
 */
public class Controller {
//    即我们的invoker
    private List<IAction> actionList = new ArrayList<>();
    public void addAction(IAction action){
        actionList.add(action);
    }
    public void execute(IAction action){
        action.execute();
    }
//    批量执行命令
    public void executes(){
        for(IAction action:actionList){
            action.execute();
        }
        actionList.clear();
    }
}
