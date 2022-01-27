package com.authontication.autho;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;



@Configuration
public class SpSconfig extends WebSecurityConfigurerAdapter {
  private UserDetailsManagerConfigurer<AuthenticationManagerBuilder, InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>>.UserDetailsBuilder roles;
@Override
public void configure(AuthenticationManagerBuilder authenticationManagerBuilder)throws Exception{
  authenticationManagerBuilder.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN");
  authenticationManagerBuilder.inMemoryAuthentication().withUser("guest").password("123").roles("USER");

}
/*@Override
protected void configure(HttpSecurity http) throws Exception {
      http.csrf().disable();
      http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();

  }*/

  //not working authorisation nnot needed
/*@Override 
protected void configure(HttpSecurity http) throws Exception {
      http.csrf().disable();
      http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();

  }  
*/
@Override
protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("USER").anyRequest().fullyAuthenticated().and().httpBasic();
  
    }
 
@Bean
public static  NoOpPasswordEncoder passwordEncoder (){
    return  (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance()  ;
    
}


    
}
