package com.lsk.cipher.behavioral.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:六月的雨
 * @Date:2021/2/28 21:45
 * @PackageName:21hj com.lsk.cipher.behavioral.delegate
 * @Description:
 */
public class Leader implements IEmployee {
    private Map<String,IEmployee> employee = new HashMap<>();
    public Leader(){
        employee.put("UI",new EmployeeA());
        employee.put("JAVA",new EmployeeB());
    }
    @Override
    public void task(String task) {
        if(!employee.containsKey(task)){
            System.out.println("指派工作有误，无法完成！");
            return;
        }
        employee.get(task).task(task);
    }
}
