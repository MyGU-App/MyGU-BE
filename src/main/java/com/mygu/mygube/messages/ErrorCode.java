package com.mygu.mygube.messages;

public enum ErrorCode {
    AUTHENTICATION_FAILED_ERR_CODE("ERR_001"),
    INVALID_USERNAME_PASSWORD_ERR_CODE("ERR_002"),

    NOT_FOUND_ERR_CODE("ERR_011"),

    INTERNAL_SERVER_ERR_CODE("ERR_999");
    private final String code;

    ErrorCode(String errorCode) {
        this.code = errorCode;
    }
    public String toString() {
        return code;
    }
}
