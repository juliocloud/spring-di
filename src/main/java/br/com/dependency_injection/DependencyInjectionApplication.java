package br.com.dependency_injection;

import br.com.dependency_injection.controllers.FieldInjectedController;
import br.com.dependency_injection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		FieldInjectedController fieldInjectedController = ctx.getBean(FieldInjectedController.class);
		if(fieldInjectedController.greetingService == null){
			System.out.println("Null!!!");
		}
		System.out.println("In the main method");
		System.out.println(controller.sayHello());
	}

}
