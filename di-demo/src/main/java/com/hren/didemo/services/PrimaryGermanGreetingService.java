package com.hren.didemo.services;

public class PrimaryGermanGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String greeting() {
        return greetingRepository.getGermanGreeting();
    }
}
