package com.example.testpipeline;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean validateUserExists(User user) {
        return true;
    }
}
