package com.eeducational.queue.model;

/**
 * Created by OuYiJian on 2017/3/8.
 */
public class ResponseResult<T> {

    protected int msgCode;
    protected String message;
    protected T result;

    public int getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static ResponseResult result(MsgCode msgCode) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.msgCode = msgCode.getMsgCode();
        responseResult.message = msgCode.getMessage();
        return responseResult;
    }

    public static <T> ResponseResult result(MsgCode msgCode, T result) {
        ResponseResult<T> responseResult = new ResponseResult();
        responseResult.msgCode = msgCode.getMsgCode();
        responseResult.message = msgCode.getMessage();
        responseResult.result = result;
        return responseResult;
    }
}
