package com.fullstack.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Desabilitado para APIs REST
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/public/**").permitAll() // Libera nossas rotas de teste
                .anyRequest().authenticated() // Bloqueia todo o resto
            );
        
        return http.build();
    }
}