package com.dailycodebuffer.crudWithHashMap;

import java.util.Date;

public class User {


    private final String name;
    private final  Date dob;

    public User(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public static void main(String[] args) {

        try {

        } finally {
            // close a db connection
        }
        User user = new User ("Sunil", new Date());

    }
}
