package com.techgeeknext.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
public class ActuatorExampleController {

    @GetMapping("/")
    public String welcomeUser(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello TechGeekNext User: " + name + "!!";
    }

}
