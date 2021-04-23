package com.lsk.cipher.behavioral.state;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 14:34
 * @PackageName:21hj com.lsk.cipher.behavioral.state
 * @Description:
 */
public class AppContext {
//    context内部维护两种状态
    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_UNLOGIN = new UnLoginState();

    private UserState currentState = STATE_UNLOGIN;

//    代码块初始化状态对应的context
    {
        STATE_LOGIN.setAppContext(this);
        STATE_UNLOGIN.setAppContext(this);
    }
//   设置状态，同时设置当前状态的context
    public void setState(UserState state){
        this.currentState = state;
        this.currentState.setAppContext(this);
    }
    public UserState getState(){
        return this.currentState;
    }
//    内部需要维护当前状态的方法
    public void favorite(){
        this.currentState.favorite();
    }

    public void comment(String comment){
        this.currentState.comment(comment);
    }
}
