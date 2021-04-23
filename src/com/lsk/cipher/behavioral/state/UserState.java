package com.lsk.cipher.behavioral.state;

/**
 * @Author:六月的雨
 * @Date:2021/3/17 16:30
 * @PackageName:21hj com.lsk.cipher.behavioral.state
 * @Description:
 */
public abstract class UserState {
//    状态接口需要维护一个context
    protected AppContext appContext;

    public void setAppContext(AppContext appContext) {
        this.appContext = appContext;
    }

    public abstract void favorite();
    public abstract void comment(String comment);
}
