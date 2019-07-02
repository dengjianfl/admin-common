package com.admin.common.pojo;

import java.io.Serializable;



public class ResultData implements Serializable {

	
    // 响应业务状态
    private Boolean isSuccess;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    
    //构建其他状态的resultdata对象
    public static ResultData build(Boolean isSuccess, String msg, Object data) {
        return new ResultData(isSuccess, msg, data);
    }

    public static ResultData ok(Object data) {
        return new ResultData(data);
    }

    public static ResultData ok() {
        return new ResultData(null);
    }

    public ResultData() {

    }

    public static ResultData build(Boolean isSuccess, String msg) {
        return new ResultData(isSuccess, msg, null);
    }

    public ResultData(Boolean isSuccess, String msg, Object data) {
        this.isSuccess = isSuccess;
        this.msg = msg;
        this.data = data;
    }

    public ResultData(Object data) {
        this.isSuccess = true;
        this.msg = "OK";
        this.data = data;
    }

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
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
