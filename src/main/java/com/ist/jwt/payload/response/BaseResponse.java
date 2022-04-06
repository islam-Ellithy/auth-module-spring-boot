package com.ist.jwt.payload.response;

public class BaseResponse {
    private String message ;
    private RestStatus status;
    private Object data;

    public BaseResponse(Object data,String message, RestStatus status) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    BaseResponse(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RestStatus getStatus() {
        return status;
    }

    public void setStatus(RestStatus status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
