package com.lsk.cipher.structualPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 14:25
 * @PackageName:21hj com.lsk.cipher.structualPatterns.proxy
 * @Description: 通过反射实现动态代理
 */
public class JDKMeipo implements InvocationHandler {
//    接口型的被代理对象的引用
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<? extends IPerson> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }
    public void before(){
        System.out.println("媒婆安排相亲！");
    }
    public void after(){
        System.out.println("成功！");
    }
}
