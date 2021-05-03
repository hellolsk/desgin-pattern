package com.lsk.cipher.behavioral.interpreter.observer;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 14:40
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter.observer
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        V2EX v2EX = V2EX.getInstance();
        Teacher toy = new Teacher("Toy");
        Teacher lucy = new Teacher("Lucy");
//        订阅主题
        v2EX.addObserver(toy);
        v2EX.addObserver(lucy);
//        被观察者消息
        Question question = new Question();
        question.setUserName("吉米");
        question.setContent("如何学习设计模式？");
//        被观察者一旦发布消息，观察者就会接收到消息。
        v2EX.publishQuestion(question);
    }
}
