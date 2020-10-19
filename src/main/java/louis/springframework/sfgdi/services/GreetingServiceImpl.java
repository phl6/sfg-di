package louis.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }

    @Override
    public String sayBye() {
        return "Bye";
    }
}
