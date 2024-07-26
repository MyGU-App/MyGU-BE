package com.mygu.mygube.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Table(name = "tokens")
@Entity
@IdClass(Token.TokenId.class)
public class Token {
    @AllArgsConstructor
    static class TokenId {
        private String userId;
        private String refreshToken;
    }
    @Id
    @Column(name = "user_id")
    private String userId;
    @Id
    @Column(name = "refresh_token")
    private String refreshToken;
}
