package com.hren.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello - Primary Greeting Service";
    }
}
