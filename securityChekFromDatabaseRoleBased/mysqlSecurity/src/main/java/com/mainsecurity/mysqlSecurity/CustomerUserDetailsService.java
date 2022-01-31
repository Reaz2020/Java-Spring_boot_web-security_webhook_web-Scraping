package com.mainsecurity.mysqlSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service 
public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired
    userRepo userRepoObj;  



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        user user = userRepoObj.findByUsername(username); 
        if (user==null){
            throw new UsernameNotFoundException("user not found");
        } ;return new customUserDetails(user);
     }
     

     /*//practise method
     void addUser(){
        user  u = new user();
        u.setId(4);
        u.setUsername("222");
        u.setPassword("1212");// we could becrypt password by importing b crypt pass encoder in config
        u.setRole("ROLE_ADMIN");
        userRepoObj.save(u);}
*/
     }
     
    

   
    


   




