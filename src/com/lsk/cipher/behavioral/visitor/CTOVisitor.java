package com.lsk.cipher.behavioral.visitor;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 19:02
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public class CTOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.name+" 代码量为"+engineer.getCodeLine());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.name+" 产品数为"+manager.getProducts());
    }
}
