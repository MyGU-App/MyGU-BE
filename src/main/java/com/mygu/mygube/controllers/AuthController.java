package com.mygu.mygube.controllers;

import com.mygu.mygube.dtos.request.LoginForm;
import com.mygu.mygube.dtos.response.AuthenDTO;
import com.mygu.mygube.exceptions.app.LoginFailException;
import com.mygu.mygube.services.interfaces.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class AuthController {
    private IAccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<Optional<AuthenDTO>> login(@RequestBody LoginForm loginForm) throws LoginFailException {
        Optional<AuthenDTO> authenResponse = accountService.login(loginForm.getUsername(), loginForm.getPassword());
        if (authenResponse.isPresent())
            return ResponseEntity.ok(authenResponse);
        throw new LoginFailException();
    }
}
