package com.lsk.cipher.principle.ocp;

/**
 * @Author:六月的雨
 * @Date:2021/1/30 22:07
 * @PackageName:21hj com.lsk.order.ocp
 * @Description:
 */

/**
 * 如果需要对java课程打折，这里单独写一个打折类，只需继承java课程，重写价格方法，
 * 无需修改原本的价格方法.
 * 这里我们实现了对java课程价格的修改，但是没有改变java课程原本的价格方法。
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(String name, Integer ID, Double price) {
        super(name, ID, price);
    }

    /**
     * 打折
     * @return
     */
    @Override
    public Double getPrice(){
        return super.getPrice()*0.8;
    }
}
