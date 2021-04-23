package com.lsk.cipher.behavioral.interpreter;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 10:07
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter
 * @Description: 继承抽象类，要么重写抽象方法,要么也被定义为抽象类
 */
public class AddInterpreter extends Interpreter {

    /**
     * 子类继承父类，可以重写父类方法，必须重写构造方法。
     * @param left
     * @param right
     */
    public AddInterpreter(IMathInterpreter left, IMathInterpreter right) {
        super(left, right);
    }


    @Override
    public int interpreter() {
        return this.left.interpreter()+this.right.interpreter();
    }
}
