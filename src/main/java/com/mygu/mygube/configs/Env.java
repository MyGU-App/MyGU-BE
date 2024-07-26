package com.mygu.mygube.configs;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Env {
    @Value("${jwt.accessToken.secretKey}")
    private String ATSecretKey;

    @Value("${jwt.refreshToken.secretKey}")
    private String RTSecretKey;

    @Value("${jwt.accessToken.expiredTime}")
    private long ATExpiredTime;

    @Value("${jwt.refreshToken.expiredTime}")
    private long RTExpiredTime;

}
