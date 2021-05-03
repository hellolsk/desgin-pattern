package com.lsk.cipher.structualPatterns.adapter;

/**
 * @Author:六月的雨
 * @Date:2021/2/23 19:29
 * @PackageName:21hj com.lsk.cipher.structualPatterns.adapter
 * @Description:
 */
public class Member {
    private String username;
    private String password;
    private String mid;
    private String info;

    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mid='" + mid + '\'' +
                ", info='" + info + '\'' +
                '}';
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
