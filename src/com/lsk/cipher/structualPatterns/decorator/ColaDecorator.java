package com.lsk.cipher.structualPatterns.decorator;

/**
 * @Author:六月的雨
 * @Date:2021/2/13 23:07
 * @PackageName:21hj com.lsk.cipher.structualPatterns.decorator
 * @Description:
 */
public class ColaDecorator extends HamburgerDecorator  {
    public ColaDecorator(Component component){
        super(component);
    }
// 装饰器可以实现自己功能
    protected void dosomething(){}
    @Override
    protected String getMessage() {
        return super.getMessage()+"colo";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
