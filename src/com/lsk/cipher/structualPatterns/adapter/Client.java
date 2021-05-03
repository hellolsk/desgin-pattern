package com.lsk.cipher.structualPatterns.adapter;

/**
 * @Author:六月的雨
 * @Date:2021/2/23 19:38
 * @PackageName:21hj com.lsk.cipher.structualPatterns.adapter
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        ResultMsg lsk = adapter.login("lsk", "123456");
        System.out.println(lsk);
        ResultMsg msg = adapter.loginForQQ("adefv13e4dft43");
        System.out.println(msg);
    }
}
