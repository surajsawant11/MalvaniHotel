package com.malvanihotel.api.auth.controller;

import com.malvanihotel.api.auth.dto.LoginRequest;
import com.malvanihotel.api.auth.dto.LoginResponse;
import com.malvanihotel.api.auth.service.AuthService;
import com.malvanihotel.api.common.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {


//    public class AuthController {

        private final AuthService authService;

        public AuthController(AuthService authService) {
            this.authService = authService;
        }

        @PostMapping("/login")
        public ResponseEntity<ApiResponse<LoginResponse>> login(
                @RequestBody LoginRequest request) {

            LoginResponse response = authService.login(request);
            return ResponseEntity.ok(
                    ApiResponse.success("Login successful", response)
            );
        }

        @PostMapping("/register")
        public ResponseEntity<ApiResponse<String>> register(
                @RequestBody LoginRequest request) {

            authService.register(request);
            return ResponseEntity.ok(
                    ApiResponse.success("User registered successfully", null)
            );
        }
    }