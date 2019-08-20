package fineto.websample.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreeting implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hola nerds";
    }
}
