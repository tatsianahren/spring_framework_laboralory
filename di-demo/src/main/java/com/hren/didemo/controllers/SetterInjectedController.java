package com.hren.didemo.controllers;

import com.hren.didemo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.greeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
