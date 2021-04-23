package com.lsk.cipher.structualPatterns.composite;

/**
 * @Author:六月的雨
 * @Date:2021/2/15 14:19
 * @PackageName:21hj com.lsk.cipher.structualPatterns.composite
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("透明组合模式");
        CourseComponent java = new Course("java",8888);
        CourseComponent ai = new Course("AI",100000);

        CourseComponent coursePackage1 = new CoursePackage("架构师", 2);

        CourseComponent design = new Course("设计模式", 5000);
        CourseComponent source = new Course("源码分析", 6000);
        CourseComponent softSkills = new Course("软技能", 3000);
        coursePackage1.addChild(design);
        coursePackage1.addChild(source);
        coursePackage1.addChild(softSkills);
        CoursePackage coursePackage2 = new CoursePackage("主目录",1);
        coursePackage2.addChild(java);
        coursePackage2.addChild(ai);
        coursePackage2.addChild(coursePackage1);

        coursePackage2.print();
    }
}
