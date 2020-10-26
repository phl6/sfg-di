package louis.springframework.sfgdi.controllers;


import louis.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public String sayBye(){
        return greetingService.sayBye();
    }

    //take a length param and gen an array with that length
    public int[] genSortedRandomArrayWithLen(int n){
        return greetingService.genSortedRandomArrayWithLen(n);
    }

}
