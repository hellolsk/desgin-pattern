package com.lsk.cipher.principle.spr;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 12:11
 * @PackageName:21hj com.lsk.principle.spr
 * @Description:
 */
public class CourseImpl implements IInfoCourse,IManageCourse {
    @Override
    public String getCourseName() {
        return "java";
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {
        System.out.println("xuexi");
    }

    @Override
    public void refundCourse() {

    }
}
