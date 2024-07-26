package com.mygu.mygube.exceptions.app;

import com.mygu.mygube.exceptions.MyGUException;
import com.mygu.mygube.messages.ErrorCode;
import com.mygu.mygube.messages.ErrorMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LoginFailException extends MyGUException {
    {
        errorCode = ErrorCode.INVALID_USERNAME_PASSWORD_ERR_CODE;
        errorMessage = ErrorMessage.INVALID_USERNAME_PASSWORD;
        httpCode = HttpStatus.OK;
    }
}
