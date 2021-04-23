package com.lsk.cipher.structualPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:六月的雨
 * @Date:2021/2/18 17:29
 * @PackageName:21hj com.lsk.cipher.structualPatterns.composite
 * @Description:
 */
public class CoursePackage extends CourseComponent {
    private List<CourseComponent> items  = new ArrayList<>();
    private String name;
    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent courseComponent) {
        items.add(courseComponent);
    }

    @Override
    public void removeChild(CourseComponent courseComponent) {
        items.remove(courseComponent);
    }

    @Override
    public String getName(CourseComponent courseComponent) {
        return this.name;
    }

    /**
     * 分级格式化打印
     */
    @Override
    public void print() {
        System.out.println(this.name);
        for(CourseComponent courseComponent : items){
            if(this.level != null){
                for(int i= 0;i<this.level;i++){
                    System.out.print(" ");
                }
                for(int i = 0;i<this.level;i++){
                    if(i==0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            courseComponent.print();
        }
    }
}
