package com.LeXiang.Entity;

import java.io.Serializable;

/**
 * @类名: Result
 * @描述:
 * @作者: 姚文华
 * @时间: 2019-09-03 15:36
 **/
public class Result implements Serializable {
private boolean success;

private  String message;

    public Result() {
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

