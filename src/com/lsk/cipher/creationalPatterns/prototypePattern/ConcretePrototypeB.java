package com.lsk.cipher.creationalPatterns.prototypePattern;

/**
 * @Author:六月的雨
 * @Date:2021/2/9 14:41
 * @PackageName:21hj com.lsk.cipher.creationalPatterns.prototypePattern
 * @Description:
 */
public class ConcretePrototypeB implements IPrototype {
    private String desc;

    public ConcretePrototypeB(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeB clone() {
        return new ConcretePrototypeB(this.desc);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
