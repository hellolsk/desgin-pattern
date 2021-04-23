package com.lsk.cipher.principle.dip;

/**
 * @Author:六月的雨
 * @Date:2021/1/30 22:27
 * @PackageName:21hj com.lsk.order.dip
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        3,构造器每次初始化会构建，因此有多个实例
       /* Tom tom = new Tom(new JavaCourse());
        tom.study();
        Tom tom1 = new Tom(new PythonCourse());
        tom1.study();*/
//       4,setter方式注入，保证只有一个全局变量
       Tom tom = new Tom();
       tom.setCourse(new JavaCourse());
       tom.study();

       tom.setCourse(new PythonCourse());
       tom.study();
//        1,传统调用
       /* tom.studyJavaCourse();
        tom.studyPythonCourse();*/

//        2,在tom增加课程后，不需要从底层修改，直接传入想学的课程对象即可
//        这其实是依赖注入
        /*tom.study(new JavaCourse());
        tom.study(new PythonCourse());*/
    }
}
