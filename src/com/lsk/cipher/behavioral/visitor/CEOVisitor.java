package com.lsk.cipher.behavioral.visitor;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 18:59
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public class CEOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.name+" kpi为"+engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.name+" kpi为"+manager.kpi+" 产品数为"+manager.getProducts());
    }
}
