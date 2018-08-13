package com.ua.df.cases.j2ee.jsf;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
@ManagedBean(name = "homeBeanModel", eager = true)
public class HomeBeanModel {

    private final static AtomicInteger callNumber = new AtomicInteger();

    public HomeBeanModel() {
        System.out.println("HomeBeanModel started!");
    }

    public String getGreetingMessage() {
        return "Hello World! (" + System.currentTimeMillis() + " - " + callNumber.incrementAndGet() + ")";
    }

    public void triggerViewCreation() {
        System.out.println("triggered-" + callNumber.incrementAndGet());
    }
}