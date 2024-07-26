package com.mygu.mygube.services.interfaces;

import com.mygu.mygube.dtos.response.AuthenDTO;

import java.util.Optional;

public interface IAccountService {
    Optional<AuthenDTO> login(String username, String password);
}
