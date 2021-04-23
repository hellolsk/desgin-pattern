package com.lsk.cipher.behavioral.interpreter.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 14:24
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter.observer
 * @Description:
 */
public class Teacher implements Observer {
    private String name;
    public Teacher(String name){
        this.name = name;
    }

    /**
     * 观察者更新的方法
     * @param observable observable对象
     * @param object 被观察者回传的消息对象
     */
    @Override
    public void update(Observable observable, Object object){
        V2EX v2EX = (V2EX) observable;
        Question question = (Question) object;
        System.out.println("----------------");
        System.out.println(name+"收到了来自："+question.getUserName()+"的提问：\n"+question.getContent());
    }
}
