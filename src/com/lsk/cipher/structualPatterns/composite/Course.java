package com.lsk.cipher.structualPatterns.composite;

/**
 * @Author:六月的雨
 * @Date:2021/2/18 17:18
 * @PackageName:21hj com.lsk.cipher.structualPatterns.composite
 * @Description:
 */
public class Course extends CourseComponent {

    private String name;
    private double price;

    public Course(String name,double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent courseComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent courseComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name+" "+price+"，RMB");
    }
}
