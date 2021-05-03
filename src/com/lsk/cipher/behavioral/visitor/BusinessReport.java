package com.lsk.cipher.behavioral.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 18:55
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public class BusinessReport {
    private List<Employee> employees = new LinkedList<Employee>();

    public BusinessReport(){
        employees.add(new Manager("A经理"));
        employees.add(new Manager("B经理"));
        employees.add(new Engineer("C工程师"));
        employees.add(new Engineer("D工程师"));
    }

    /**
     * 报表展示
     * @param visitor
     */
    public void showReport(IVisitor visitor){
        for(Employee employee : employees){
           employee.accept(visitor);
        }
    }
}
