package com.kodilla.kodillaspringsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SercurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf().disable();

        http.authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "employees/**")
                .hasAnyRole("R1", "R2", "R3")
                .mvcMatchers(HttpMethod.POST, "/**")
                .hasAnyRole( "R2", "R3")
                .mvcMatchers(HttpMethod.DELETE, "/**")
                .hasAnyRole("R3")
                .anyRequest()
                .fullyAuthenticated()
                .and()
                .httpBasic(withDefaults());

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails r1 = User.withDefaultPasswordEncoder()
                .username("r1")
                .password("r1")
                .roles("R1")
                .build();
        UserDetails r2 = User.withDefaultPasswordEncoder()
                .username("r2")
                .password("r2")
                .roles("R2")
                .build();
        UserDetails r3 = User.withDefaultPasswordEncoder()
                .username("r3")
                .password("r3")
                .roles("R3")
                .build();
        return new InMemoryUserDetailsManager(r1, r2, r3);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
