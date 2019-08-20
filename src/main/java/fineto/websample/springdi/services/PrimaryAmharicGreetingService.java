package fineto.websample.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("amh")
@Primary
public class PrimaryAmharicGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "ጤና ይስጥልኝ ";
    }
}
