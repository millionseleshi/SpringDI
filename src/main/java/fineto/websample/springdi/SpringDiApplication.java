package fineto.websample.springdi;

import fineto.websample.springdi.controllers.ConstructorInjectedController;
import fineto.websample.springdi.controllers.GetterInjectedController;
import fineto.websample.springdi.controllers.MyController;
import fineto.websample.springdi.controllers.PropertyInjectedController;
import fineto.websample.springdi.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDiApplication.class, args);

		MyController myController=(MyController) context.getBean("myController");

		myController.hello();

		System.out.println(context.getBean(PropertyInjectedController.class).greetingServiceImp.sayGreeting());
		System.out.println(context.getBean(GetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}

}
