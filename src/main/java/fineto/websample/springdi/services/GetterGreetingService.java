package fineto.websample.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Nerds-I am injected by the Getter";
    }
}
