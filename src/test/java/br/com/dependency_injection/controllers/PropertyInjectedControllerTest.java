package br.com.dependency_injection.controllers;

import br.com.dependency_injection.controllers.injections.PropertyInjectedController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

    @Test
    void sayHello(){
        System.out.println(propertyInjectedController.sayHello());
    }
}