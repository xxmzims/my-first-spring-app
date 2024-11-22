package ru.ugrinovitch.springApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("ClassicalMusic doMyInit");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyDestroy(){
        System.out.println("ClassicalMusic doMyDestroy");
    }
}
