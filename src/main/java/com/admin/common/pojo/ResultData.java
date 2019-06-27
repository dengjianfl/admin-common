package com.admin.common.pojo;

import java.io.Serializable;



public class ResultData implements Serializable {

	
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    
    //构建其他状态的resultdata对象
    public static ResultData build(Integer status, String msg, Object data) {
        return new ResultData(status, msg, data);
    }

    public static ResultData ok(Object data) {
        return new ResultData(data);
    }

    public static ResultData ok() {
        return new ResultData(null);
    }

    public ResultData() {

    }

    public static ResultData build(Integer status, String msg) {
        return new ResultData(status, msg, null);
    }

    public ResultData(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResultData(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
