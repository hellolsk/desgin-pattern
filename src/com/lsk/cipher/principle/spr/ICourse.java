package com.lsk.cipher.principle.spr;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 09:21
 * @PackageName:21hj com.lsk.principle.spr
 * @Description:
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
