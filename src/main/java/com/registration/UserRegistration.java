package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {

    private boolean check;
    private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}";
    private static final String PATTERN_FOR_EMAIL =  "^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
    private static final String PATTERN_FOR_PHONE_NUMBER =  "^[0-9]{1,3} [0-9]{10}$";
    private static final String PATTERN_FOR_PASSWORD =  "^^(?=.*[A-Z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,12}$";

    //UC1
    public void checkFirstName(String firstName) throws UserRegistrationException {
        if(!Pattern.compile(PATTERN_FOR_NAME).matcher(firstName).matches())
            throw new UserRegistrationException("Invalid First Name");
    }

    //UC2
    public void checkLastName(String lastName) throws UserRegistrationException {
        if (!Pattern.compile(PATTERN_FOR_NAME).matcher(lastName).matches())
            throw new UserRegistrationException("Invalid Last Name");
    }

    //UC3
    public void checkEmailId(String email) throws UserRegistrationException {
        if (!Pattern.compile(PATTERN_FOR_EMAIL).matcher(email).matches())
            throw new UserRegistrationException("Invalid Email");
    }

    //UC4
    public void checkPhoneNumber(String phoneNumber) throws UserRegistrationException {
        if (!Pattern.compile(PATTERN_FOR_PHONE_NUMBER).matcher(phoneNumber).matches())
            throw new UserRegistrationException("Invalid Phone Number");
    }

    //UC5
    public void checkPassword(String password) throws UserRegistrationException {
        if (!Pattern.compile(PATTERN_FOR_PASSWORD).matcher(password).matches())
            throw new UserRegistrationException("Invalid Password");
    }

    //UC9
    public boolean checkEmail(String email) {
        check = Pattern.compile(PATTERN_FOR_EMAIL).matcher(email).matches();
        return check;
    }
}
