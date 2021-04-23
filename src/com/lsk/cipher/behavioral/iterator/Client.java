package com.lsk.cipher.behavioral.iterator;

/**
 * @Author:六月的雨
 * @Date:2021/3/16 20:15
 * @PackageName:21hj com.lsk.cipher.behavioral.iterator
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Course java = new Course("java");
        Course python = new Course("python");
        Course ai = new Course("ai");

        CourseAggregateImpl courseAggregate = new CourseAggregateImpl();

        courseAggregate.add(java);
        courseAggregate.add(python);
        courseAggregate.add(ai);

        print(courseAggregate);

    }

    public static void print(CourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println(course.getName());
        }
    }
}
