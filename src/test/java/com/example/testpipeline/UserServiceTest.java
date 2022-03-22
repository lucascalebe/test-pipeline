package com.example.testpipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserService.class)
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void validateUserExists() {
        Assertions.assertTrue(userService.validateUserExists(new User()));
    }
}