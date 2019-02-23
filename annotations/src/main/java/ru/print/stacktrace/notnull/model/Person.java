package ru.print.stacktrace.notnull.model;

import java.util.List;

public class Person {
    private final String name;
    private final Integer age;
    private List<String> addresses;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
}
