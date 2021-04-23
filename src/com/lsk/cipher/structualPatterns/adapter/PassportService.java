package com.lsk.cipher.structualPatterns.adapter;

/**
 * @Author:六月的雨
 * @Date:2021/2/23 19:26
 * @PackageName:21hj com.lsk.cipher.structualPatterns.adapter
 * @Description:
 */
public class PassportService {
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }
    public ResultMsg login(String username,String password){
        return null;
    }
}
