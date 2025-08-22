package br.com.dependency_injection.controllers;

import br.com.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServicePropertyInjected")
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
