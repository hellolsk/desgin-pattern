package com.lsk.cipher.behavioral.responsibility;

/**
 * @Author:六月的雨
 * @Date:2021/3/14 11:00
 * @PackageName:21hj com.lsk.cipher.behavioral.responsibility
 * @Description:
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setInfo("管理员");
        chain.doHandler(member);
    }
}
