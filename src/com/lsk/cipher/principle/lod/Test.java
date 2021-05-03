package com.lsk.cipher.principle.lod;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 15:22
 * @PackageName:21hj com.lsk.principle.lod
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Leader leader = new Leader();
        Employee employee = new Employee();
        leader.commandCheckNumber(employee);
    }
}
