package com.lsk.cipher.behavioral.state;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 14:55
 * @PackageName:21hj com.lsk.cipher.behavioral.state
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AppContext appContext = new AppContext();
        appContext.favorite();
        appContext.comment("我赞！");
    }
}
