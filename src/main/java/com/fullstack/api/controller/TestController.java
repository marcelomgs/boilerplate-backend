package com.fullstack.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/public")
public class TestController {

    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        return Map.of(
            "status", "UP",
            "message", "API do Boilerplate rodando com sucesso!"
        );
    }

    @GetMapping("/ping")
public Map<String, String> ping() {
    return Map.of(
        "status", "OK",
        "message", "Deploy automático funcionando!"
    );
}

}