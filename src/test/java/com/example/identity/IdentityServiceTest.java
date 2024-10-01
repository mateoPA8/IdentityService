package com.example.identity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class IdentityServiceTest {
    @Autowired
    private IdentityService identityService;
    @Test
    void getCi() {
        int expectedCi = 98795626;
        assertEquals(expectedCi, identityService.getCi());
    }
}