package com.lsk.cipher.creationalPatterns.prototypePattern;

import java.io.*;
import java.util.List;

/**
 * @Author:六月的雨
 * @Date:2021/2/9 15:01
 * @PackageName:21hj com.lsk.cipher.creationalPatterns.prototypePattern
 * @Description: 原型模式的浅克隆
 */
public class ConcretePrototype implements Cloneable, Serializable {
    private String desc;
    private List<String> hobbies;

    public ConcretePrototype(String desc) {
        this.desc = desc;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConcretePrototype cloneType = null;
//        基于堆内存的二进制流复制方式
        cloneType =  (ConcretePrototype)super.clone();
        return cloneType;
    }

    /**
     * 深克隆方式
     * @return
     */
    public ConcretePrototype deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "desc='" + desc + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
