package com.lsk.cipher.behavioral.iterator;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 20:03
 * @PackageName:21hj com.lsk.cipher.behavioral.iterator
 * @Description:
 */
public interface CourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
