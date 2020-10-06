package com.wcs.checkpoint2.portfolio.config;

import com.wcs.checkpoint2.portfolio.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder);
        return authProvider;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // All authorize
        /*http
                .authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/img/**","/download/**","/vendor/bootstrap/**","/portfolio","/menu","/index","/api/**","/admin/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin() //  default log in page
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/logout")
                .permitAll()
                .and()
                .httpBasic();*/

      http
                .authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/img/**","/download/**","/vendor/bootstrap/**","/portfolio","/menu","/index").permitAll()
                .antMatchers("/api/**").hasRole("USER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin() //  default log in page
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/logout")
                .permitAll()
                .and()
                .httpBasic();
    }


}