package com.hren.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class SpanishPrimaryGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hola - Servicio de saludo primario";
    }
}
