package com.example.basic_auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class BasicAuthApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(new BCryptPasswordEncoder().encode("password"));
        System.out.println(new Pbkdf2PasswordEncoder().encode("password"));
        System.out.println(new SCryptPasswordEncoder().encode("password"));

        Map<String,PasswordEncoder> encoders = new HashMap<String,PasswordEncoder>();
        encoders.put("bcrypt",new BCryptPasswordEncoder());
        encoders.put("scrypt",new SCryptPasswordEncoder());
        encoders.put("pbkd",new Pbkdf2PasswordEncoder());
        System.out.println("");
        System.out.println(new DelegatingPasswordEncoder("bcrypt",encoders).encode("password"));

    }

}
