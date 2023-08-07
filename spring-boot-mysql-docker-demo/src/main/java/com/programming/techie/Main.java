package com.programming.techie.sbd;

import com.programming.techie.Greeting;
import com.programming.techie.GreetingRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    private final GreetingRepository greetingRepository;

    public Main(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostMapping("/greet")
    public String greet(String message) {
        Greeting savedGreeting = greetingRepository.save(new Greeting(message));
        return "Your greeting - " + savedGreeting.getGreeting() + " has been saved!";
    }

}
