package louis.springframework.sfgdi.controllers;

import louis.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    public String getBye(){
        return greetingService.sayBye();
    }
}
