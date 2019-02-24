package com.charlesmuchene.java;

public class Singleton {

    private static Singleton singleton;
    private static long start = 0;

    private Singleton() {
    }

    static Singleton getSingleton() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }

    public void initialize() {
        start = System.currentTimeMillis();
        System.out.println("Initialize configuration");
    }

    long getLapseTime() {
        return System.currentTimeMillis() - start;
    }
}
