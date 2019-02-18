package com.charlesmuchene.java;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }

    public void initialize() {
        System.out.println("Initialize configuration");
    }

    public long getLapseTime() {
        return 0L;
    }
}
