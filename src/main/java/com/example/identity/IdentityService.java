package com.example.identity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class IdentityService {
    @Value("${ci}")
    private int ci;
    public int getCi(){
        return ci;
    }
}
