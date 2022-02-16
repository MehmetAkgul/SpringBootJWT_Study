package com.springbootjwt_study.springbootjwt_study;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    // JWT için MyUserDetailsService class mutlaka create edilmeli

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Bu metod aplicationa kullanıcını kullanıcı adı ve şifresini ve yertkilerini tanımlar
        return new User("admin", "1234", new ArrayList<>());
        //  new ArrayList<>()--> collection type dır birden falza veri oludğu için boş bir array create edildi.
    }
}
