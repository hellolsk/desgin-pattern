package com.lsk.cipher.behavioral.memento;

import java.util.Stack;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 22:29
 * @PackageName:21hj com.lsk.cipher.behavioral.memento
 * @Description:
 */
public class DraftBox {
    private final Stack<ArticleMemento> STACK = new Stack<>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = null;
//        业务场景一：草稿实时保存，所以撤销指的是回滚到上一版本，并不是上一步。
//        第一次弹栈是当前对象，第二次弹栈是上一个对象。
//        articleMemento = STACK.pop();
//        articleMemento = STACK.pop();

//        业务场景二：及时撤销，用户在不保存的情况下撤销，即回退到上一步。
        articleMemento = STACK.pop();

        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }
}
