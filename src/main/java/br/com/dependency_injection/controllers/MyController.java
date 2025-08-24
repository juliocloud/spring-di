package br.com.dependency_injection.controllers;

import br.com.dependency_injection.services.greetings.GreetingService;
import br.com.dependency_injection.services.greetings.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm on the controller");
        return greetingService.sayGreeting();
    }
}
