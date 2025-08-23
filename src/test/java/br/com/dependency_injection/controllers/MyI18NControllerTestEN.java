package br.com.dependency_injection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"EN", "dev"})
@SpringBootTest
class MyI18NControllerTestEN {

    @Autowired
    MyI18NController myI18NController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void sayHello() {
        myI18NController.sayHello();
    }
}