package fineto.websample.springdi.controllers;

import fineto.websample.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

public GreetingService greetingServiceImp;

    String sayHello(){
        return greetingServiceImp.sayGreeting();
    }

//    public GreetingServiceImp getGreetingServiceImp() {
//        return greetingServiceImp;
//    }
}
