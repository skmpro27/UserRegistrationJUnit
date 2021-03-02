package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {

    private boolean check;
    private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}";

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
}
