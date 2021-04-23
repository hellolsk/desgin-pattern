package com.lsk.cipher.behavioral.delegate;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 21:49
 * @PackageName:21hj com.lsk.cipher.behavioral.delegate
 * @Description:
 */
public class Boss {
    public void command(String task,Leader leader){
        leader.task(task);
    }
}
