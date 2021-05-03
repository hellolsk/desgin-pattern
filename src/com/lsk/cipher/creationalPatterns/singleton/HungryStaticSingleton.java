package com.lsk.cipher.creationalPatterns.singleton;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 11:25
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public class HungryStaticSingleton {
//    1,提供唯一(static)实例，
    private static final HungryStaticSingleton hungryStaticSingleton = new HungryStaticSingleton();
//    2,私有构造器，不能new的方式创建对象，只能自己提供
    private HungryStaticSingleton(){
    };
//    3，获取实例，全局（static）唯一入口
    public static HungryStaticSingleton getInstance(){
            return hungryStaticSingleton;
    }
}
