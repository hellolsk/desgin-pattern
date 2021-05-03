package com.lsk.cipher.structualPatterns.adapter;

/**
 * @Author:六月的雨
 * @Date:2021/2/23 19:34
 * @PackageName:21hj com.lsk.cipher.structualPatterns.adapter
 * @Description:
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token,null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone,null);
    }

    private ResultMsg loginForRegist(String username,String password){
        if(null==password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
