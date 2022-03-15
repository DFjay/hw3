package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Primary
public class Cat implements IAnimal {
    @Override
    public String say() {
        return "МЯУ";
    }

    @PostConstruct
    public void create() {
        System.out.println("BEAN CAT CREATED");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BEAN CAT DESTROYED");
    }
}
