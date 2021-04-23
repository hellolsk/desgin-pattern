package com.lsk.cipher.structualPatterns.adapter;

/**
 * @Author:六月的雨
 * @Date:2021/2/23 19:31
 * @PackageName:21hj com.lsk.cipher.structualPatterns.adapter
 * @Description: 支持第三方登录的接口
 */
public interface IPassportForThird {
    ResultMsg loginForQQ(String openId);
    ResultMsg loginForWechat(String openId);
    ResultMsg loginForToken(String token);
    ResultMsg loginForTelphone(String phone,String code);
}
