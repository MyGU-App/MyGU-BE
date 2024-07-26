package com.mygu.mygube.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.mygu.mygube.configs.Env;
import com.mygu.mygube.entities.Account;
import com.mygu.mygube.entities.User;
import com.mygu.mygube.enums.TokenType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
@AllArgsConstructor
public class JWTUtils {
    private Env env;

    public String generateToken(TokenType tokenType,  Account account) {
        Algorithm algorithm;
        Date expDate;

        if (Objects.requireNonNull(tokenType) == TokenType.ACCESS_TOKEN) {
            algorithm = Algorithm.HMAC256(env.getATSecretKey());
            expDate = new Date(System.currentTimeMillis() + env.getATExpiredTime() * 1000L);
        } else {
            algorithm = Algorithm.HMAC256(env.getRTSecretKey());
            expDate = new Date(System.currentTimeMillis() + env.getRTExpiredTime() * 1000L);
        }
        return JWT.create()
                .withIssuer("MyGU")
                .withSubject(account.getUserId().toString())
                .withClaim("username", account.getUsername())
                .withIssuedAt(new Date())
                .withExpiresAt(expDate)
                .sign(algorithm);
    }
}
