package com.lsk.cipher.principle.spr;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 09:15
 * @PackageName:21hj com.lsk.principle.spr
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        1，一个类有两个功能
      /*  Course course = new Course();
        course.study("直播");
        course.study("录播");*/

//      2，类层面的单一原则
      LiveCourse liveCourse = new LiveCourse();
      liveCourse.study("直播");

      ReplyCourse replyCourse = new ReplyCourse();
      replyCourse.study("录播");

//      3,接口层面


//       4,方法层面

    }
}
