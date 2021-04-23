package com.lsk.cipher.behavioral.visitor;

import java.util.Random;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 17:30
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public abstract class Employee {
    public String name;
    public int kpi;

    public Employee(String name){
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 接受访问者访问
     * @param visitor 访问者接口
     */
    public abstract void accept(IVisitor visitor);
}
