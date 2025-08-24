package br.com.dependency_injection.controllers.injections;

import br.com.dependency_injection.services.greetings.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectedController {

    @Autowired
    public GreetingService greetingService;

    public FieldInjectedController() {
    }
}
