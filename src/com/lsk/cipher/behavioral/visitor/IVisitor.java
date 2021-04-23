package com.lsk.cipher.behavioral.visitor;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 17:33
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public interface IVisitor {
    /**
     * 访问工程师
     * @param engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问经理
     * @param manager
     */
    void visit(Manager manager);
}
