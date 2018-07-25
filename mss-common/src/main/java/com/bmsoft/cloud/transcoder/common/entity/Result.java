package com.bmsoft.cloud.transcoder.common.entity;


import lombok.Data;
import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 2633283546876721434L;

    private Integer code;
    private String msg;
    private String description;
    private long total;
    private T data;

    /**
     * 普通查询返回结果
     * @param code
     * @param msg
     * @param data
     */
    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data =  data;
    }

    //返回结果带分页
    public Result(Integer code, String msg, T data,long total) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.total=total;
    }

    public Result(T data) {
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }

    public Result(T data,long total) {
        this.code = 200;
        this.msg = "success";
        this.data = data;
        this.total=total;
    }

    public static Result build(Integer code, String msg) {
        return new Result(code, msg, null);
    }

    public static Result build(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public static  Result ok() {
        return new Result(null);
    }

    public static Result ok(Object data) {
        return new Result(data);
    }

    public static Result ok(Object data,long total) {
        return new Result(data,total);
    }


}
