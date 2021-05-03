package com.lsk.cipher.behavioral.interpreter.observer;

import java.util.Observable;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 14:26
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter.observer
 * @Description:
 */
public class V2EX extends Observable {
    private String name = "V2EX";
    private static  V2EX v2EX = null;

    private V2EX(){};

    public static V2EX getInstance(){
        if(null == v2EX){
            v2EX = new V2EX();
        }
        return v2EX;
    }

    public String getName() {
        return name;
    }

    /**
     * 发布消息方法
     * @param question 被通知的消息
     */
    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.name+"上，发出了一个问题。");
//        状态改变
        setChanged();
//        通知所有观察者
        notifyObservers(question);
    }
}
