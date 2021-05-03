package com.lsk.cipher.structualPatterns.adapter;

/**
 * @Author:六月的雨
 * @Date:2021/2/23 19:43
 * @PackageName:21hj com.lsk.cipher.structualPatterns.adapter
 * @Description:
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id,Object adapter);
}
