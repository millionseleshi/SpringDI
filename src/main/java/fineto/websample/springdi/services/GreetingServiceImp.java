package fineto.websample.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {

    public static final String HELLO_NERDS="Hello NERDS";

    @Override
    public String sayGreeting()
    {
        return  HELLO_NERDS;
    }
}
