package com.expensetracker.cofig;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())   // disable CSRF
                .cors(cors -> {})               // enable CORS
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()   // allow ALL requests (no login required)
                );

        return http.build();
    }
}
