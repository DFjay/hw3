package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    private IAnimal animal;

    public ConstructorInjection(@Qualifier("dog") IAnimal animal) {
        this.animal = animal;
    }

    public String say() {
        return animal.say();
    }
}
