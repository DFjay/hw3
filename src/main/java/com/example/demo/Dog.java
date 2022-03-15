package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements IAnimal {
    @Override
    public String say() {
        return "ГАВ";
    }

    @PostConstruct
    public void create() {
        System.out.println("BEAN DOG CREATED");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BEAN DOG DESTROYED");
    }
}
