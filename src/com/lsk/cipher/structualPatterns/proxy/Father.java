package com.lsk.cipher.structualPatterns.proxy;

/**
 * @Author:六月的雨
 * @Date:2021/2/12 14:15
 * @PackageName:21hj com.lsk.cipher.structualPatterns.proxy
 * @Description:
 */
public class Father implements IPerson {
//    对儿子的引用
    private Son son;
    public Father(Son son){
        this.son = son;
    }
    @Override
    public void findGirls() {
        System.out.println("帮儿子相亲!");
        son.findGirls();
        System.out.println("相亲成功！");
    }
}
