package com.lsk.cipher.structualPatterns.decorator;

/**
 * @Author:六月的雨
 * @Date:2021/2/13 23:11
 * @PackageName:21hj com.lsk.cipher.structualPatterns.decorator
 * @Description:
 */
public class MilkDecorator extends HamburgerDecorator {
    public MilkDecorator(Component component) {
        super(component);
    }

    @Override
    protected String getMessage() {
        return super.getMessage()+"牛奶";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
