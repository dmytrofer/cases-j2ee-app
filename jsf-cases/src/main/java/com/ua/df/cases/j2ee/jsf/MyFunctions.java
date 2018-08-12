package com.ua.df.cases.j2ee.jsf;

import java.util.concurrent.atomic.AtomicInteger;

public final class MyFunctions {

    private static final AtomicInteger COUNTER = new AtomicInteger();

    private MyFunctions() {
    }

    public static String nextGreeting() {
        return "Message #" + COUNTER.incrementAndGet();
    }
}
