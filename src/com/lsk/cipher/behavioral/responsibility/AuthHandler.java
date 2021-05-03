package com.lsk.cipher.behavioral.responsibility;

/**
 * @Author:六月的雨
 * @Date:2021/3/14 11:01
 * @PackageName:21hj com.lsk.cipher.behavioral.responsibility
 * @Description:
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if(!"管理员".equals(member.getInfo())){
            System.out.println("您不是管理员，没有操作权限!");
            return;
        }
        System.out.println("欢迎管理员！");
    }
}
