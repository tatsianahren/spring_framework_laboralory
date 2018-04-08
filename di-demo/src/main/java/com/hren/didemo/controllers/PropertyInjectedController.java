package com.hren.didemo.controllers;

import com.hren.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.greeting();
    }
}
