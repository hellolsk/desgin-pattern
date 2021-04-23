package com.lsk.cipher.behavioral.memento;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 22:47
 * @PackageName:21hj com.lsk.cipher.behavioral.memento
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        DraftBox draftBox = new DraftBox();
        Editor editor = new Editor("标题1", "备忘录模式", "abc.img");
        ArticleMemento articleMemento = editor.saveToMemento();
        draftBox.addMemento(articleMemento);
        System.out.println(editor.getTitle()+"\t"+editor.getContent()+"\t"+editor.getImg());

        System.out.println("修改标题");
        editor.setTitle("标题2");
        System.out.println("发生了修改后");
//        业务场景一：修改后并保存
       /* articleMemento = editor.saveToMemento();
        draftBox.addMemento(articleMemento);*/
        System.out.println(editor.getTitle()+"\t"+editor.getContent()+"\t"+editor.getImg());

//        测试业务场景一
        articleMemento = draftBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("执行撤销指令后");
        System.out.println(editor.getTitle()+"\t"+editor.getContent()+"\t"+editor.getImg());
    }
}
