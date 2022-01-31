package com.mainsecurity.mysqlSecurity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class customUserDetails implements UserDetails{ 
    
    
    @Autowired
     user usr;
    

    public customUserDetails(user user) {
        super();
        this.usr = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(usr.getRole()));
       
        
    }

    @Override
    public String getPassword() {
        
        return usr.getPassword();
    }
    @Override
    public boolean isAccountNonExpired() {
        
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        
        return true;
    }
    @Override
    public boolean isEnabled() {
        
        return true;
    }

    @Override
    public String getUsername() {
        
        return usr.getUsername();
    }
}
