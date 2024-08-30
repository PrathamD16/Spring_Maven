//package com.example.hello_springboot.controller;
//import java.util.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//
//public class ApplicationSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        //dispatcherTypeMatchers(HttpMethod.valueOf("/api/orders/**")).hasAnyRole("USER", "ADMIN")
//                        .dispatcherTypeMatchers(HttpMethod.valueOf("/login")).hasRole("USER")
//                        .anyRequest().authenticated()
//                )
//                .httpBasic(withDefaults());
//        return http.build();
//    }
//
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        List<UserDetails> users = new ArrayList<>();
//        users.add(User.withDefaultPasswordEncoder().username("Krishna")
//                .password("5555").roles("USER").build());
//
//        return new InMemoryUserDetailsManager(users);
////        UserDetails user = User.withUsername("user")
////                .password("{noop}password")
////                .roles("USER")
////                .build();
////        UserDetails admin = User.withUsername("admin")
////                .password("{noop}admin")
////                .roles("ADMIN")
////                .build();
////        return new InMemoryUserDetailsManager(user, admin);
//    }
//
//
//}
