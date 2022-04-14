package com.example.lesson6task6java;

public class User {
    String name;

    public User(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
