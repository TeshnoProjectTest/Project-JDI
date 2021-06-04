package io.github.epam.entities;


public class Users {
    public static User DEFAULT_USER = new User();

    public static User USER_WITH_CONTACTS = new User().set(u -> {
        u.name = "Roman";
        u.firstName = "Ivan";
        u.lastName = "Ivanov";
        u.position = "Programmer";
        u.passportNumber = "0129";
        u.passportSeria = "999999";
        u.description = "This world is full of unsolved mysteries";
        u.gender = "Male";
    });
}
