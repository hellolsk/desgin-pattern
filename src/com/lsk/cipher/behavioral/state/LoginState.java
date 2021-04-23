package com.lsk.cipher.behavioral.state;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 14:34
 * @PackageName:21hj com.lsk.cipher.behavioral.state
 * @Description:
 */
public class LoginState extends UserState {
    @Override
    public void favorite() {
        System.out.println("收藏成功！");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
