package com.lsk.cipher.behavioral.memento;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 22:26
 * @PackageName:21hj com.lsk.cipher.behavioral.memento
 * @Description:
 */
public class Editor {
    private String title;
    private String content;
    private String img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    //    保存功能，实际是保存到备忘录
    public ArticleMemento saveToMemento() {
        ArticleMemento articleMemento = new ArticleMemento(this.title, this.content, this.img);
        return articleMemento;
    }

//    撤销功能就是从栈中取出上一个ArticleMemento对象
    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.img = articleMemento.getImg();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public Editor(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }
}
