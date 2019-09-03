package com.test;

import org.springframework.stereotype.Component;

@Component
public class User {
    String name ="lixin";

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
