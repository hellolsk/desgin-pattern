package com.lsk.cipher.behavioral.visitor;

import java.util.Random;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 17:32
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    public int getCodeLine(){
        return new Random().nextInt(10*1000);
    }
}
