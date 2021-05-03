package com.lsk.cipher.behavioral.interpreter;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 11:00
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter
 * @Description:
 */
public class OperatorUtils {
    public static boolean ifOperator(String symbol){
        return (symbol.equals("+")||symbol.equals("-")||symbol.equals("*")||symbol.equals("/"));
    }
    public static Interpreter getInterpreter(IMathInterpreter left, IMathInterpreter right,String symbol){
        if("+".equals(symbol)){
            return new AddInterpreter(left, right);
        }else if("-".equals(symbol)){
            return new SubInterpreter(left, right);
        }else if ("*".equals(symbol)){
            return new MultiInterpreter(left, right);
        }else if ("/".equals(symbol)){
            return new DivInterpreter(left, right);
        }
        return null;
    }
}
