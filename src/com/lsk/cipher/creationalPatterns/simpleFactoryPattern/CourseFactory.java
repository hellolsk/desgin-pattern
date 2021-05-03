package com.lsk.cipher.creationalPatterns.simpleFactoryPattern;

/**
 * @Author:六月的雨
 * @Date:2021/1/30 19:41
 * @PackageName:21hj com.lsk.creational_patterns.factory_pattern
 * @Description:
 */

/**
 * 工厂类
 */
public class CourseFactory {
    public  ICourse create(String name) {
       /* if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }*/

//      2,采用反射，解决添加其他课程，需要更改工厂类的create方法的问题
       /* if (name != null && !"".equals(name)) {
            try {
                return (ICourse) Class.forName(name).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;*/

       return null;
    }

    //       3,解决字符串参数的弊端以及强制转换的问题
    public static ICourse create(Class<? extends ICourse> clazz){
        if(clazz !=null){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
