package com.nagaraj.toDoManagement.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfiguration {
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
    throws Exception {
        auth.inMemoryAuthentication()
            .passwordEncoder(NoOpPasswordEncoder.getInstance())
            .withUser("admin").password("admin")
            .roles("USER", "ADMIN");
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().requestMatchers("/login", "/h2-console/**").permitAll()
            .requestMatchers("/", "/*todo*/**").access("hasRole('USER')").and()
            .formLogin();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
