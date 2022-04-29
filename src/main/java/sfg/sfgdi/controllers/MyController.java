package sfg.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String myGreeting() {
        System.out.println("Hello World!");

        return "Howdy!";
    }
}
