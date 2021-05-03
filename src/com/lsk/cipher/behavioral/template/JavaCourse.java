package com.lsk.cipher.behavioral.template;

/**
 * @Author:六月的雨
 * @Date:2021/3/2 16:34
 * @PackageName:21hj com.lsk.cipher.behavioral.template
 * @Description:
 */
public class JavaCourse extends AbstractCourse {
    private boolean needCheckHomework = false;
    public void setNeedCheckHomework(boolean needCheckHomework){
        this.needCheckHomework = needCheckHomework;
    }

//    重写父类方法，java可以选择是否需要检查作业
    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查java");
    }
}
