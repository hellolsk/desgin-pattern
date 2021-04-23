package com.lsk.cipher.behavioral.state;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 14:35
 * @PackageName:21hj com.lsk.cipher.behavioral.state
 * @Description:
 */
public class UnLoginState extends UserState {
//    未登录状态下的行为多了一个切换操作
    @Override
    public void favorite() {
        this.switch2Login();
        this.appContext.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switch2Login();
        this.appContext.getState().favorite();
    }
//    切换到登录
    public void switch2Login(){
        System.out.println("跳转到登录页面！");
        this.appContext.setState(AppContext.STATE_LOGIN);
    }
}
