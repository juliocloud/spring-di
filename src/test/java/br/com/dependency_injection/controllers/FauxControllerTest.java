package br.com.dependency_injection.controllers;

import br.com.dependency_injection.controllers.faux.FauxController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FauxControllerTest {

    @Autowired
    FauxController fauxController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void whichEnvImAt() {
        fauxController.whichEnvImAt();
    }
}