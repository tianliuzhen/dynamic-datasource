package com.aaa.mybatisplus.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(1,"success"),

    SYSTEM_ERROR(2,"system_error"),
    ;

    private int code;
    private String message;
}
