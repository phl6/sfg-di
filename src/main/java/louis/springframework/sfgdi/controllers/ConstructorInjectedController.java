package louis.springframework.sfgdi.controllers;

import louis.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    public String getBye(){
        return greetingService.sayBye();
    }

    public int[] genSortedRandomArrayWithLen(int n){ return greetingService.genSortedRandomArrayWithLen(n); }
}
