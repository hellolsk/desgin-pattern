package com.lsk.cipher.structualPatterns.decorator;

/**
 * @Author:六月的雨
 * @Date:2021/2/13 23:13
 * @PackageName:21hj com.lsk.cipher.structualPatterns.decorator
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Component component;
//        套餐基本服务是有一个汉堡
        component = new Hamburger();
//        现在想在汉堡的基础上继续买一杯可乐
        component = new ColaDecorator(component);
//        再买一杯牛奶，返回的始终是汉堡对象
        component = new MilkDecorator(component);

        System.out.println(component.getMessage()+",总价:"+component.getPrice());
    }
}
