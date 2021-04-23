package com.lsk.cipher.behavioral.responsibility;

/**
 * @Author:六月的雨
 * @Date:2021/3/14 10:54
 * @PackageName:21hj com.lsk.cipher.behavioral.responsibility
 * @Description: 校验处理器
 */
public class ValidHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if(null == member.getUsername() || null ==member.getPassword()){
            System.out.println("用户名或密码为空!");
            return;
        }
        System.out.println("用户名密码校验成功！");
        chain.doHandler(member);
    }
}
