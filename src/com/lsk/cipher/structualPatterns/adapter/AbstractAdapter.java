package com.lsk.cipher.structualPatterns.adapter;

/**
 * @Author:六月的雨
 * @Date:2021/2/23 19:45
 * @PackageName:21hj com.lsk.cipher.structualPatterns.adapter
 * @Description:
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter{

    @Override
    public boolean support(Object object) {
        return false;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }

    private ResultMsg loginForRegist(String username,String password){
        if(null==password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
