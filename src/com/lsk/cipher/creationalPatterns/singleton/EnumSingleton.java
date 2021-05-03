package com.lsk.cipher.creationalPatterns.singleton;

/**
 * @Author:六月的雨
 * @Date:2021/2/1 20:42
 * @PackageName:21hj com.lsk.creationalPatterns.singleton
 * @Description:
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
