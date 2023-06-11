package cl.acc.tutorial.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author fseguel
 */
@RestController
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
    
}
