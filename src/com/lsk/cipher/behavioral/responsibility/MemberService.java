package com.lsk.cipher.behavioral.responsibility;

/**
 * @Author:六月的雨
 * @Date:2021/3/14 11:03
 * @PackageName:21hj com.lsk.cipher.behavioral.responsibility
 * @Description:
 */
public class MemberService {
    public void login(String username,String password){
        ValidHandler validHandler = new ValidHandler();
        LoginHandler loginHandler = new LoginHandler();
        AuthHandler authHandler = new AuthHandler();

//        责任链模式的业务处理顺序，分别指定各处理器的当前对象
        validHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validHandler.doHandler(new Member(username,password,"管理员"));
    }
}
