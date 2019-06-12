package com.chidrome.code401d4.day12.firstWebAppInJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Mark this class as a controller so that SpringBoot knows to look at it
@RestController
public class HelloWorldController {

    // specify the route for this method
    @GetMapping("/")
    public String getHelloWorld() {
        return "Hello, world! It's a beautiful day.";
    }

    @GetMapping("/hello/{name}/{from}")
    public String getHeloToMe(@PathVariable String name, @PathVariable String from){
        return "Hello, " + name + " from " + from;
    }

}
