package com.lsk.cipher.behavioral.responsibility;

/**
 * @Author:六月的雨
 * @Date:2021/3/14 10:51
 * @PackageName:21hj com.lsk.cipher.behavioral.responsibility
 * @Description:
 */
public abstract class Handler {
    protected Handler chain;
//    指定当前对象
    public void next(Handler handler){
        this.chain = handler;
    }
//   自己的业务逻辑处理
    public abstract void doHandler(Member member);
}
