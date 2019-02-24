package com.charlesmuchene.java;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Charles", 23, "Home Street");
        System.out.println(student);

        Singleton singleton = Singleton.getSingleton();
        long lapseTime = singleton.getLapseTime();
        System.out.printf("Lapsed time is: %dms", lapseTime);

    }
}
