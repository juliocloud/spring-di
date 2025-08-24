package br.com.dependency_injection.services.greetings;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from property injected service";
    }
}
