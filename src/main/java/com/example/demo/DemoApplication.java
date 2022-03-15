package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private static ConstructorInjection constructorInjection;
    private static FieldInjection fieldInjection;
    private static SetterInjection setterInjection;

    public DemoApplication(ConstructorInjection constructorInjection, FieldInjection fieldInjection, SetterInjection setterInjection) {
        DemoApplication.constructorInjection = constructorInjection;
        DemoApplication.fieldInjection = fieldInjection;
        DemoApplication.setterInjection = setterInjection;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(constructorInjection.say());
        System.out.println(fieldInjection.say());
        System.out.println(setterInjection.say());
    }
}
