package br.com.dependency_injection.services.greetings;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greetings from the setter injected service";
    }
}
