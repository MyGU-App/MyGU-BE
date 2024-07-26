package com.mygu.mygube.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenDTO {
    private UserDTO userInfo;
    private String refreshToken;
    private String accessToken;
}
