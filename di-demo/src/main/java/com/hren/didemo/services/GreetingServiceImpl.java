package com.hren.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING = "Hello!! - Original";

    @Override
    public String greeting() {
        return GREETING;
    }
}
