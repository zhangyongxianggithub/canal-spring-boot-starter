package com.bestzyx.canal.starter;

import java.util.Objects;

/**
 * Created by zhangyongxiang on 2024/4/2 8:19 PM
 **/

public class Result<T> {
    
    private Integer code;
    
    private T data;
    
    private String message;
    
    public Integer getCode() {
        return code;
    }
    
    public void setCode(final Integer code) {
        this.code = code;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(final T data) {
        this.data = data;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof final Result<?> result)) {
            return false;
        }
        return Objects.equals(getCode(), result.getCode())
                && Objects.equals(getData(), result.getData())
                && Objects.equals(getMessage(), result.getMessage());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getData(), getMessage());
    }
    
    @Override
    public String toString() {
        return "Result{" + "code=" + code + ", data=" + data + ", message='"
                + message + '\'' + '}';
    }
}
