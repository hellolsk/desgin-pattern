package com.lsk.cipher.behavioral.interpreter;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 10:15
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter
 * @Description:
 */
public class NumInterpreter implements IMathInterpreter {
    public int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpreter() {
        return this.value;
    }
}
