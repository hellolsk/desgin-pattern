package com.lsk.cipher.structualPatterns.decorator;

/**
 * @Author:六月的雨
 * @Date:2021/2/13 22:59
 * @PackageName:21hj com.lsk.cipher.structualPatterns.decorator
 * @Description:
 */
public class Hamburger extends Component {
    @Override
    protected String getMessage(){
        return "汉堡";
    }
    @Override
    public int getPrice(){
        return 3;
    }
}
