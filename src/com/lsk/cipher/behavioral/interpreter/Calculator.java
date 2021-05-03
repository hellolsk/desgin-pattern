package com.lsk.cipher.behavioral.interpreter;

import java.util.Stack;

/**
 * @Author:六月的雨
 * @Date:2021/3/30 10:16
 * @PackageName:21hj com.lsk.cipher.behavioral.interpreter
 * @Description: 此处仅考虑简单计算，从左至右直接算
 */
public class Calculator {
    private Stack<IMathInterpreter> stack = new Stack<>();

    public Calculator(String expression){
        this.parse(expression);
    }

    /**
     * 此处仅考虑简单计算，从左至右直接算
     * @param expression
     */
    public void parse(String expression){
        String[] ele = expression.split(" ");
        IMathInterpreter left,right;

        for(int i=0;i<ele.length;i++){
            String operator = ele[i];
            if(OperatorUtils.ifOperator(operator)){
//                是操作符，将前一个数字弹出
                left = stack.pop();
                right = new NumInterpreter(Integer.valueOf(ele[++i]));
                System.out.println("出栈："+left.interpreter()+"和"+right.interpreter());
//                将计算结果压入栈中
//                通过传递待计算项，由解释器复制解释
                this.stack.push(OperatorUtils.getInterpreter(left,right,operator));
                System.out.println("运算符："+operator);
            }else {
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(ele[i]));
                this.stack.push(numInterpreter);
                System.out.println("入栈："+numInterpreter.interpreter());
            }
        }
    }

    public int calculate(){
//       计算时直接弹出结果即可
        return this.stack.pop().interpreter();
    }
}
