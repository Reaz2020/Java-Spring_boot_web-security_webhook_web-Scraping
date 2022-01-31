package com.mainsecurity.mysqlSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WbSecurityConfig extends WebSecurityConfigurerAdapter {
    

@Autowired    
private UserDetailsService userDetailsSer;
    


@Bean
AuthenticationProvider AuthonticationProvider (){
    DaoAuthenticationProvider providre = new DaoAuthenticationProvider();
    providre.setUserDetailsService(userDetailsSer);
    providre.setPasswordEncoder(new BCryptPasswordEncoder());
    return providre;

    }


@Override
protected void configure(HttpSecurity http) throws Exception {
    
    http
    
    .authorizeRequests()
    .antMatchers("/")
    .permitAll()

    .antMatchers("/home")
    .hasAuthority("USER")
    .antMatchers("/admin")
    .hasAuthority("ADMIN")
    .antMatchers("/nehal")
    .hasAuthority("/ADMIN")

    .anyRequest()
    .authenticated()
    .and()
    .httpBasic();
}
}



    

