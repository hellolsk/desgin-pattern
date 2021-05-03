package com.lsk.cipher.creationalPatterns.builderPattern;

/**
 * @Author:六月的雨
 * @Date:2021/2/9 17:01
 * @PackageName:21hj com.lsk.cipher.creationalPatterns.builderPattern
 * @Description:
 */
public class CourseBuilder {
    private Course course = new Course();
    public Course builder(){
        return course;
    }
    public CourseBuilder addName(String name){
        course.setName(name);
        return this;
    }
    public CourseBuilder addPpt(String ppt){
        course.setPpt(ppt);
        return this;
    }
    public CourseBuilder addNote(String note){
        course.setNote(note);
        return this;
    }
    public CourseBuilder addVideo(String video){
        course.setVideo(video);
        return this;
    }
}
