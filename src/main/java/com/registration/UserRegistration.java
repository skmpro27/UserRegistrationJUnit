package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean check;
    public static final String patternForName = "[A-Z]{1}[a-z]{2,}";

    //UC1
    public boolean checkFirstName(String firstName) {

        check = Pattern.compile(patternForName).matcher(firstName).matches();
        return check;
    }

}
