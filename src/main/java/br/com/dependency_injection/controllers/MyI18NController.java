package br.com.dependency_injection.controllers;

import br.com.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {
    private final GreetingService greetingService;

    public MyI18NController(@Qualifier("translationService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello(){
        System.out.println(greetingService.sayGreeting());
    }
}
