package fineto.websample.springdi.controllers;

import fineto.websample.springdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @BeforeEach
   public void setUp() {

        GetterInjectedController getterInjectedController=new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImp());
    }

    @Test
    public void testingGetterInjectedContoller() {

        assertEquals(GreetingServiceImp.HELLO_NERDS,getterInjectedController.sayHello());
    }
}
