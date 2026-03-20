package com.fullstack.api.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
public class PrivateController {

    @GetMapping("/test")
    public Map<String, String> privateTest() {
        return Map.of(
            "status", "OK",
            "message", "Você acessou uma rota privada!"
        );
    }
}
