package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {

    private boolean check;
    private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}";
    private static final String PATTERN_FOR_EMAIL = "^[a-zA-z0-9’*+/=?!#$%]{1,}(?:\\.[a-zA-Z0-9’*+/=?!#$%]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";

    //UC1
    public boolean checkFirstName(String firstName) {
        check = Pattern.compile(PATTERN_FOR_NAME).matcher(firstName).matches();
        return check;
    }

    //UC2
    public boolean checkLastName(String lastName) {
        check = Pattern.compile(PATTERN_FOR_NAME).matcher(lastName).matches();
        return check;
    }

    //UC3
    public boolean checkEmail(String email) {
        check = Pattern.compile(PATTERN_FOR_EMAIL).matcher(email).matches();
        return check;
    }
}
