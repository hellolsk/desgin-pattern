package com.lsk.cipher.behavioral.interpreter;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 10:05
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter
 * @Description:
 */
public abstract class Interpreter implements IMathInterpreter {
    protected  IMathInterpreter left;
    protected IMathInterpreter right;

    public Interpreter(IMathInterpreter left, IMathInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
