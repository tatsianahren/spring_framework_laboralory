package com.hren.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello I was injected by constructor";
    }
}
