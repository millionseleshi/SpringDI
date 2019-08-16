package fineto.websample.springdi.controllers;

import fineto.websample.springdi.services.GreetingService;
import fineto.websample.springdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
  public   void setUp() throws Exception {

        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
   public void testingConstructorInjectedController() throws Exception {

        assertEquals(GreetingServiceImp.HELLO_NERDS,constructorInjectedController.sayHello());
    }
}
