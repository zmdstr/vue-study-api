package com.example.vueapi;

/**
 * @author:
 * @date: 2023/3/4 3:16 下午
 * @description
 */

public class JsonResult<T> {
    private String msg;
    private Integer code;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <E> JsonResult<E> success(E t) {

        return new JsonResult<>(200, t);
    }
}