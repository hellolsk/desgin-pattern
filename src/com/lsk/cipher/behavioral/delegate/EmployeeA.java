package com.lsk.cipher.behavioral.delegate;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 21:42
 * @PackageName:21hj com.lsk.cipher.behavioral.delegate
 * @Description:
 */
public class EmployeeA implements IEmployee {
    @Override
    public void task(String task) {
        task = "设计";
        System.out.println("A执行"+task);
    }
}
