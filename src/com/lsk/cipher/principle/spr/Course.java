package com.lsk.cipher.principle.spr;

/**
 * @Author:六月的雨
 * @Date:2021/1/31 09:11
 * @PackageName:21hj com.lsk.principle.spr
 * @Description:
 */
public class Course {
    public void study(String courseName) {
        if("直播".equals(courseName)){
            System.out.println("直播课不能快进");
        }else if("录播".equals(courseName)){
            System.out.println("录播课随意");
        }else {
            System.out.println("没有相关服务");
        }
    }
}
