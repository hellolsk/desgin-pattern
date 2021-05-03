package com.lsk.cipher.creationalPatterns.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 21:58
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class ContainerSingleton {
    private ContainerSingleton(){
    }
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();
    public static Object getBean(String className){
        synchronized (ioc){
            Object obj = null;
            if(!ioc.containsKey(className)){
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }

    }
}
