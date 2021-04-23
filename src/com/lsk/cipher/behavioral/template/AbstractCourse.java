package com.lsk.cipher.behavioral.template;

/**
 * @Author:六月的雨
 * @Date:2021/3/2 15:56
 * @PackageName:21hj com.lsk.cipher.behavioral.template
 * @Description:
 */
public abstract class AbstractCourse {
    //    封装课程发布的6个步骤
    public final void createCourse() {
//        1,发布资料
        postPreResource();
//        2，制作ppt
        createPPT();
//        3，直播
        liveVideo();
//        4,提交笔记
        postNotes();
//        5,布置作业
        postHomework();
//        6,检查作业
        if (needCheckHomework()) {
            checkHomework();
        }
    }

    protected boolean needCheckHomework() {
        return false;
    }

    protected abstract void checkHomework();

    protected void postHomework() {
        System.out.println("布置作业");
    }

    protected void postPreResource() {
        System.out.println("上传资料");
    }

    protected void liveVideo() {
        System.out.println("直播");
    }

    protected void createPPT() {
        System.out.println("制作PPT");
    }

    protected void postNotes() {
        System.out.println("提交笔记");
    }

}
