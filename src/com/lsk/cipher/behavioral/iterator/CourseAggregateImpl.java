package com.lsk.cipher.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 20:11
 * @PackageName:21hj com.lsk.cipher.behavioral.iterator
 * @Description:
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(courseList);
    }
}
