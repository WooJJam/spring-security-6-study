package com.eazybytes.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Security 의존성 추가시 내부적으로 모든 요청을 보호함
 * 초기 id: user
 * password: 콘솔 확인
 */
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Application with Security";
    }
}
