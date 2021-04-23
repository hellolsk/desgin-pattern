package com.lsk.cipher.behavioral.interpreter;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 10:14
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter
 * @Description:
 */
public class DivInterpreter extends Interpreter {
    public DivInterpreter(IMathInterpreter left, IMathInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return this.left.interpreter()/this.right.interpreter();
    }
}
