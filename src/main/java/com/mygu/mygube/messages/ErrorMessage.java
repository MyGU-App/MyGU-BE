package com.mygu.mygube.messages;

public enum ErrorMessage {
    AUTHENTICATION_FAILED("Authentication Failed"),
    INTERNAL_SERVER_ERROR("Internal server error"),
    NOT_FOUND("Not found"),
    INVALID_USERNAME_PASSWORD("Invalid username or password"),;

    private final String message;
    ErrorMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}
