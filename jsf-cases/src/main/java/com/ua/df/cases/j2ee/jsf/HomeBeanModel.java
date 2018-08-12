package com.ua.df.cases.j2ee.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HomeBeanModel {

    public HomeBeanModel() {
        System.out.println("HomeBeanModel started!");
    }

    public String getGreetingMessage() {
        return "Hello World! (" + System.currentTimeMillis() + ")";
    }
}