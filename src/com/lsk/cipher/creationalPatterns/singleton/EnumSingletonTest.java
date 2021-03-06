package com.lsk.cipher.creationalPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 21:23
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance1 = null;
        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance2.setData(new Object());

        try {
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton)ois.readObject();
            ois.close();
            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData()==instance2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
