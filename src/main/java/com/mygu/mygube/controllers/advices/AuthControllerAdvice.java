package com.mygu.mygube.controllers.advices;

import com.mygu.mygube.dtos.response.ErrorDTO;
import com.mygu.mygube.dtos.response.MyGUResponseFail;
import com.mygu.mygube.exceptions.MyGUException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AuthControllerAdvice {

    @ExceptionHandler(value = MyGUException.class)
    public ResponseEntity<?> loginFail(MyGUException e) {
        return ResponseEntity.status(e.getHttpCode()).body(
                new MyGUResponseFail(ErrorDTO.fromException(e))
        );
    }

}
