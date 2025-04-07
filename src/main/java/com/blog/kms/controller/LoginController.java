package com.blog.kms.controller;

import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:5173")
@RestController
public class LoginController {
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
	    String email = loginData.get("email");
	    String password = loginData.get("password");

	    // 🔒 고정된 값 비교 (너만 로그인 가능하게!)
	    if ("nas7062@naver.com".equals(email) && "kr706270kr".equals(password)) {
	        String token = UUID.randomUUID().toString(); // 혹은 JWT 등
	        return ResponseEntity.ok(Map.of("token", token));
	    }

	    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
	}
}
