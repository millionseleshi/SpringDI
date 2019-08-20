package fineto.websample.springdi.controllers;

import fineto.websample.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImp")
    public GreetingService greetingServiceImp;

    String sayHello(){
        return greetingServiceImp.sayGreeting();
    }

//    public GreetingServiceImp getGreetingServiceImp() {
//        return greetingServiceImp;
//    }
}
