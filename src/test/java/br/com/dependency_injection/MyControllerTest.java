package br.com.dependency_injection;

import br.com.dependency_injection.controllers.MyController;
import org.junit.jupiter.api.Test;

public class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}
