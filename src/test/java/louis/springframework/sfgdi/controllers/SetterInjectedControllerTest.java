package louis.springframework.sfgdi.controllers;

import louis.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService()); //setter injection
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

    @Test
    void getBye() {
        System.out.println(controller.getBye());
    }
}