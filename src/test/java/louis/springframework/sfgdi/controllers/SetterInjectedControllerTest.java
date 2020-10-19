package louis.springframework.sfgdi.controllers;

import louis.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl()); //setter injection
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