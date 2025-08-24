package br.com.dependency_injection.services.i18n;

import br.com.dependency_injection.services.greetings.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("translationService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola mundo - ES";
    }
}