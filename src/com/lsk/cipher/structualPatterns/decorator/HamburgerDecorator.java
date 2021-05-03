package com.lsk.cipher.structualPatterns.decorator;

/**
 * @Author:六月的雨
 * @Date:2021/2/13 23:03
 * @PackageName:21hj com.lsk.cipher.structualPatterns.decorator
 * @Description: 抽象装饰器
 */
public abstract class HamburgerDecorator extends Component {
    private Component component;
    public HamburgerDecorator(Component component){
        this.component = component;
    }

    @Override
    protected String getMessage() {
        return this.component.getMessage();
    }

    @Override
    public int getPrice() {
        return this.component.getPrice();
    }
}
