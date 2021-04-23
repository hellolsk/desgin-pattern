package com.lsk.cipher.behavioral.delegate;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 21:41
 * @PackageName:21hj com.lsk.cipher.behavioral.delegate
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        new Boss().command("UI",new Leader());
        new Boss().command("JAVA",new Leader());
    }
}
