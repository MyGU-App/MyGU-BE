package com.mygu.mygube.exceptions.app;

import com.mygu.mygube.exceptions.MyGUException;
import com.mygu.mygube.messages.ErrorCode;
import com.mygu.mygube.messages.ErrorMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AuthenticationFailException extends MyGUException {
    {
        errorCode = ErrorCode.AUTHENTICATION_FAILED_ERR_CODE;
        errorMessage = ErrorMessage.AUTHENTICATION_FAILED;
        httpCode = HttpStatus.UNAUTHORIZED;
    }
}
