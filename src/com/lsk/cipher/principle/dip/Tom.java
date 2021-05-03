package com.lsk.cipher.principle.dip;

/**
 * @Author:六月的雨
 * @Date:2021/1/30 22:20
 * @PackageName:21hj com.lsk.order.dip
 * @Description:
 */
public class Tom {
//    2,以接口作为参数，实例化时自己选择需要实现的对象
//    其实是依赖注入
   /* public void study(ICourse iCourse){
        iCourse.study();
    }*/
//   3,实现构造器注入
   private ICourse iCourse;
  /* public Tom(ICourse iCourse){
       this.iCourse = iCourse;
   }*/
//  4,setter注入
  public void setCourse(ICourse iCourse){
      this.iCourse = iCourse;
  }
   public void study(){
       iCourse.study();
   }
//    1,当学习其他的课程后需要修改此处代码，
    /*public void studyJavaCourse(){
        System.out.println("学java");
    }
    public void studyPythonCourse(){
        System.out.println("学python");
    }*/
}
