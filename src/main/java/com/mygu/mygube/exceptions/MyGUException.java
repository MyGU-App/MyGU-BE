package com.mygu.mygube.exceptions;

import com.mygu.mygube.messages.ErrorCode;
import com.mygu.mygube.messages.ErrorMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class MyGUException extends Exception {
    protected ErrorCode errorCode;
    protected ErrorMessage errorMessage;
    protected HttpStatus httpCode;
}
