package com.mygu.mygube.dtos.response;

import com.mygu.mygube.exceptions.MyGUException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDTO {
    private String errorCode;
    private String errorMessage;

    public static ErrorDTO fromException(MyGUException e) {
        return new ErrorDTO(e.getErrorCode().toString(), e.getErrorMessage().toString());
    }
}
