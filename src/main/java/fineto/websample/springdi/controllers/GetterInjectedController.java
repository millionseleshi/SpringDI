package fineto.websample.springdi.controllers;

import fineto.websample.springdi.services.GreetingService;

public class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService= greetingService;
    }
}
