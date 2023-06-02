package org.sid.service;

import org.sid.dto.Credential;
import org.sid.dto.UserResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface CheckRTAService {
    UserResponse loadUSerResponse(Credential credential) throws IOException;
}
