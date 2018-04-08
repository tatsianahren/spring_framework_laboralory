package com.hren.didemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING = "Hello!!";

    @Override
    public String greeting() {
        return GREETING;
    }
}
