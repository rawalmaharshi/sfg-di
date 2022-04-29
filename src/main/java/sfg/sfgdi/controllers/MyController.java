package sfg.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import sfg.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String myGreeting() {
        return greetingService.sayGreeting();
    }
}
