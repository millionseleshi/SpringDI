package fineto.websample.springdi.controllers;

import fineto.websample.springdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PropertyInjectedControllerTest {
    
  private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() throws Exception
    {
        PropertyInjectedController propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImp.sayGreeting();
    }


    @Test
    public void testingGreetingService() throws Exception {

        assertEquals(GreetingServiceImp.HELLO_NERDS,propertyInjectedController.sayHello());
    }
}
