package com.lsk.cipher.principle.ocp;

/**
 * @Author:六月的雨
 * @Date:2021/1/30 22:02
 * @PackageName:21hj com.lsk.order.ocp
 * @Description:
 */
public class JavaCourse implements ICourse {
    private String name;
    private Integer ID;
    private Double price;

    @Override
    public Integer getID() {
        return this.ID;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.ID = id;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public JavaCourse(String name, Integer ID, Double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }
}
