package com.aaa.mybatisplus.common;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/18
 */


import com.aaa.mybatisplus.enums.ResultCode;

/**
 * @Author: Sawyer
 * @Description: 基础controller，用来包装http返回对象
 * @Date: Created in 上午10:43 17/8/11
 */
public abstract class BaseController {

    /**
     * 默认成功返回
     *
     * @param data
     * @return
     */
    protected <T> HttpResult<T> responseOK(T data) {
        HttpResult<T> restResult = new HttpResult<>();
        restResult.setSuccess(true);
        restResult.setData(data);
        restResult.setCode(ResultCode.SUCCESS.getCode());
        restResult.setMessage(ResultCode.SUCCESS.getMessage());
        return restResult;
    }

    /**
     * 默认成功返回带消息
     *
     * @param data
     * @param msg
     * @return
     */
    protected <T> HttpResult<T> responseOK(T data, String msg) {
        HttpResult<T> restResult = new HttpResult<>();
        restResult.setSuccess(true);
        restResult.setData(data);
        restResult.setCode(ResultCode.SUCCESS.getCode());
        restResult.setMessage(msg);
        return restResult;
    }

    /**
     * 默认失败返回, 不带参数
     *
     * @return
     */
    protected <T> HttpResult<T> responseFail() {
        return responseFail(ResultCode.SYSTEM_ERROR);
    }

    /**
     * 默认失败返回, 带信息
     *
     * @param message
     * @return
     */
    protected <T> HttpResult<T> responseFail(String message) {
        return responseFail(ResultCode.SYSTEM_ERROR, message);
    }

    /**
     * 默认失败返回，带code
     *
     * @param code
     * @return
     */
    protected <T> HttpResult<T> responseFail(ResultCode code) {
        return responseFail(code, code.getMessage());
    }

    /**
     * 失败返回
     *
     * @param code    错误Code
     * @param message 若为null，则使用Code对应的默认信息
     * @return
     */
    protected <T> HttpResult<T> responseFail(ResultCode code, String message) {
        HttpResult<T> restResult = new HttpResult<>();
        restResult.setSuccess(false);
        restResult.setCode(code.getCode());
        message = message == null ? code.getMessage() : message;
        restResult.setMessage(message);
        return restResult;
    }
}

