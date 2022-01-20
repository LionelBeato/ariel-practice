package com.ariel.noodle.noodle.Controller;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import com.ariel.noodle.noodle.Model.Greeting;
import com.ariel.noodle.noodle.Repository.GreetingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    GreetingRepository greetingRepository;

    // we use this counter to generate ids in a safe manner
    // private final AtomicLong counter = new AtomicLong(); 

    // @GetMapping("/greeting")
    // public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
    //     return new Greeting(counter.incrementAndGet(), name);
    // }

    // create method

    // we need to add @RequestBody in order to parse the body of our HTTP request
    // otherwise, our JSON information will be completely ignored
    @PostMapping("/post")
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        System.out.println(greeting);
        return greetingRepository.save(greeting);
    }

    // update method

    // get method 

    @GetMapping("/get/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable Long id) {
        return greetingRepository.findById(id);
    }

    // delete method
    
}
