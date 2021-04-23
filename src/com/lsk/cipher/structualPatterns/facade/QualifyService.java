package com.lsk.cipher.structualPatterns.facade;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 20:33
 * @PackageName:21hj com.lsk.cipher.structualPatterns.facade
 * @Description:
 */
public class QualifyService {
    public boolean isAvailable(Gift gift){
        System.out.println(gift.getName()+"成功积**分");
        return true;
    }
}
