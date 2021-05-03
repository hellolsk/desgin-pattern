package com.lsk.cipher.behavioral.visitor;

import java.util.Random;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 17:34
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    public int getProducts(){
        return new Random().nextInt(10);
    }
}
