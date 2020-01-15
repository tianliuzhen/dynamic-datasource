package com.aaa.mybatisplus.config.configGlobalException.exception;

/**
 * 用于Hibernate Validator的校验异常
 *
 * @author soul
 */
public class IllegalValidateException extends RuntimeException {
    private static final long serialVersionUID = 8096590956382108583L;

    public IllegalValidateException(String message) {
        super(message);
    }

    public IllegalValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalValidateException(Throwable cause) {
        super(cause);
    }

    protected IllegalValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
