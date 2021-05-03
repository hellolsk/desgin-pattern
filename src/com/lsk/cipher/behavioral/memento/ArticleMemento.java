package com.lsk.cipher.behavioral.memento;

/**
 * @Author:六月的雨
 * @Date:2021/3/18 22:27
 * @PackageName:21hj com.lsk.cipher.behavioral.memento
 * @Description:
 */
public class ArticleMemento {
    private String title;
    private String content;
    private String img;

    public ArticleMemento(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
