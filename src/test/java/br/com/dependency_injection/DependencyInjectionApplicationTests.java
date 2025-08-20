package br.com.dependency_injection;

import br.com.dependency_injection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext appCtx;

	@Autowired
	MyController controller;

	@Test
	void testAutoWired() {
		System.out.println(controller.sayHello());
	}

	@Test
	void testAppContext() {
		MyController controller = appCtx.getBean(MyController.class);
		controller.sayHello();
	}

	@Test
	void contextLoads() {
	}

}
