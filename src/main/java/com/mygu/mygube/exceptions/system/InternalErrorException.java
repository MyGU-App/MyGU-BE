package com.mygu.mygube.exceptions.system;

import com.mygu.mygube.exceptions.MyGUException;
import com.mygu.mygube.messages.ErrorCode;
import com.mygu.mygube.messages.ErrorMessage;
import org.springframework.http.HttpStatus;

public class InternalErrorException extends MyGUException {
    {
        errorCode = ErrorCode.INTERNAL_SERVER_ERR_CODE;
        errorMessage = ErrorMessage.INTERNAL_SERVER_ERROR;
        httpCode = HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
