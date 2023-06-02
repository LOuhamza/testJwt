package org.sid.sec;

import org.sid.dto.Credential;
import org.sid.dto.UserResponse;
import org.sid.service.CheckRTAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RestAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private CheckRTAService checkRTAService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        // Make a request to your REST API to authenticate the user
        // Implement the logic to authenticate the user using the provided username and password
        // You can use RestTemplate or any other HTTP client library to make the API call
        // ...
        UserResponse userResponse = new UserResponse();
        try {
            userResponse = checkRTAService.loadUSerResponse(new Credential("894","123"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        // If the authentication is successful, return an authenticated Authentication object
        // Example:
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(userResponse.getRole()));
        return new UsernamePasswordAuthenticationToken(username, password, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
