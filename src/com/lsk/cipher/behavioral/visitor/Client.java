package com.lsk.cipher.behavioral.visitor;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 19:04
 * @PackageName:21hj com.lsk.cipher.behavioral.visitor
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();
        System.out.println("CEO查看报表：");
        businessReport.showReport(new CEOVisitor());
        System.out.println("CTO查看报表");
        businessReport.showReport(new CTOVisitor());
    }
}
