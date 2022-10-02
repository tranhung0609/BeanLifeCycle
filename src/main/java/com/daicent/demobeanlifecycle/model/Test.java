package com.daicent.demobeanlifecycle.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Test {
    @PostConstruct
    public void postConstruct() {
        System.out.println("Test init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Test destroy");
    }

}
