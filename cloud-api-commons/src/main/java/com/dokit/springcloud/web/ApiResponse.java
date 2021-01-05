package com.dokit.springcloud.web;

public class ApiResponse {

    public static final String SUCCESS_CODE = "200";

    public static final String SUCCESS_MESSAGE = "操作成功";

    public static final String SYSTEM_ERROR_CODE = "500";

    public static final String SYSTEM_ERROR_MESSAGE = "系统错误";

    public static final String UNAUTHENTICATED_CODE = "401";

    public static final String UNAUTHENTICATED_MESSAGE = "您未登录或您的会话已过期";

    public static final String CONCURRENT_LOGIN_CODE = "409";

    public static final String CONCURRENT_LOGIN_MESSAGE = "您已在其他地方登录";

    public static final String UNAUTHORIZED_CODE = "403";

    public static final String UNAUTHORIZED_MESSAGE = "您的权限不足";

    public static final String NOT_FOUND_CODE = "404";

    public static final String NOT_FOUND_MESSAGE = "请求地址错误";

    public static ApiResponse success() {
        return new ApiResponse(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static ApiResponse success(String message) {
        return new ApiResponse(SUCCESS_CODE, message);
    }

    public static ApiResponse success(String code, String message) {
        return new ApiResponse(code, message);
    }

    public static ApiResponse error() {
        return new ApiResponse(SYSTEM_ERROR_CODE, SYSTEM_ERROR_MESSAGE);
    }

    public static ApiResponse error(String message) {
        return new ApiResponse(SYSTEM_ERROR_CODE, message);
    }

    public static ApiResponse unauthenticated() {
        return new ApiResponse(UNAUTHENTICATED_CODE, UNAUTHENTICATED_MESSAGE);
    }

    public static ApiResponse concurrentLogin() {
        return new ApiResponse(CONCURRENT_LOGIN_CODE, CONCURRENT_LOGIN_MESSAGE);
    }

    public static ApiResponse unauthorized() {
        return new ApiResponse(UNAUTHORIZED_CODE, UNAUTHORIZED_MESSAGE);
    }

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应结果中文描述
     */
    private String message;

    /**
     * 响应数据
     */
    private Object data;

    public ApiResponse() {
    }

    public ApiResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public ApiResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApiResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ApiResponse setData(Object data) {
        this.data = data;
        return this;
    }

}
