package com.lsk.cipher.creationalPatterns.prototypePattern;

import java.util.ArrayList;

/**
 * @Author:六月的雨
 * @Date:2021/2/9 14:44
 * @PackageName:21hj com.lsk.cipher.creationalPatterns.prototypePattern
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype original = new ConcretePrototype("original");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("eat");
        arrayList.add("fly");
        original.setHobbies(arrayList);
        System.out.println(original);

        ConcretePrototype clone = (ConcretePrototype) original.deepClone();
        clone.setDesc("clone");
        clone.getHobbies().add("sleep");
        System.out.println(clone);
        System.out.println(original);
        System.out.println(original==clone);
    }
}
