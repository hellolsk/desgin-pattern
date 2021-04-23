package com.lsk.cipher.behavioral.responsibility;

/**
 * @Author:六月的雨
 * @Date:2021/3/14 11:07
 * @PackageName:21hj com.lsk.cipher.behavioral.responsibility
 * @Description:
 */
public class Member {
    private String username;
    private String password;
    private String info;

    public Member(String username, String password, String info) {
        this.username = username;
        this.password = password;
        this.info = info;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
