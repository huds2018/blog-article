package com.hds.article.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by admin on 2018/8/20.
 */
@ApiModel(value = "响应实体",description = "http请求的通用返回实体")
public class BaseResponse<T> implements Serializable{
    @ApiModelProperty(value = "返回编码")
    private int code;
    @ApiModelProperty(value = "数据实体")
    private T item;
    @ApiModelProperty(value = "附加信息")
    private String message;

    public BaseResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BaseResponse(int code, T item, String message) {
        this.code = code;
        this.item = item;
        this.message = message;
    }

    public static BaseResponse response(String message, Integer code, Object item) {
        BaseResponse entity = new BaseResponse();
        entity.code = code;
        entity.message = message;
        entity.item = item;
        return entity;
    }

}
