package com.lsk.cipher.behavioral.delegate;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 21:44
 * @PackageName:21hj com.lsk.cipher.behavioral.delegate
 * @Description:
 */
public class EmployeeB implements IEmployee {
    @Override
    public void task(String task) {
        task = "编程";
        System.out.println("B执行"+task);
    }
}
