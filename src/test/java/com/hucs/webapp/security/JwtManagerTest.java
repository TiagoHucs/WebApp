package com.hucs.webapp.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtManagerTest {

    JwtManager jwtManager = new JwtManager();

    @Test
    void tokenTest() {
        String token = jwtManager.generateToken("tiagohucs");
        Assertions.assertEquals(true,jwtManager.validateToken(token));

        String refreshToken = jwtManager.refreshToken(token);
        Assertions.assertEquals(true,jwtManager.validateToken(refreshToken));
    }


}