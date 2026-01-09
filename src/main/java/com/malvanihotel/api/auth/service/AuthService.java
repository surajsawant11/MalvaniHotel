package com.malvanihotel.api.auth.service;

import com.malvanihotel.api.auth.dto.LoginRequest;
import com.malvanihotel.api.auth.dto.LoginResponse;
import org.springframework.stereotype.Service;


public interface AuthService {
    public LoginResponse login(LoginRequest request) ;

    void register(LoginRequest request);
}
