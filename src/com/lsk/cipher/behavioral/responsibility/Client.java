package com.lsk.cipher.behavioral.responsibility;

/**
 * @Author:六月的雨
 * @Date:2021/3/14 11:09
 * @PackageName:21hj com.lsk.cipher.behavioral.responsibility
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("lsk","123");
    }
}
