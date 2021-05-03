package com.lsk.cipher.behavioral.strategy;

/**
 * @Author:六月的雨
 * @Date:2021/3/11 22:13
 * @PackageName:21hj com.lsk.cipher.behavioral.stragey
 * @Description:
 */
public class MsgResult {
    private String msg;
    private int code;
    private Object data;

    public MsgResult(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
