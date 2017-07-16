package com.eeducational.queue.model;

/**
 * Created by OuYiJian on 2017/5/7.
 */
public enum MsgCode {

    SUCCESSFUL(200, "操作成功"),
    SYSTEM_ERROR(500, "系统繁忙，请稍后再试");


    private int msgCode;
    private String message;

    MsgCode(int msgCode, String message) {
        this.msgCode = msgCode;
        this.message = message;
    }

    public int getMsgCode() {
        return msgCode;
    }

    public String getMessage() {
        return message;
    }


}
