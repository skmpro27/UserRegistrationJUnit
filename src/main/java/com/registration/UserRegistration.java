package com.registration;

import java.util.regex.Pattern;

interface IUserInputIsValid {
    boolean isValid(String pattern, String userInput);
}

public class UserRegistration {

    private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}";
    private static final String PATTERN_FOR_EMAIL =  "^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
    private static final String PATTERN_FOR_PHONE_NUMBER =  "^[0-9]{1,3} [0-9]{10}$";
    private static final String PATTERN_FOR_PASSWORD =  "^^(?=.*[A-Z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,12}$";

    IUserInputIsValid checkValue = ((pattern, userInput) -> Pattern.compile(pattern).matcher(userInput).matches());

    public boolean checkFirstName(String firstName) throws UserRegistrationException {
        if(checkValue.isValid(PATTERN_FOR_NAME, firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    }

    public boolean checkLastName(String lastName) throws UserRegistrationException {
        if(checkValue.isValid(PATTERN_FOR_NAME, lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    }

    public boolean checkEmailId(String email) throws UserRegistrationException {
        if(checkValue.isValid(PATTERN_FOR_EMAIL, email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    }

    public boolean checkPhoneNumber(String phoneNumber) throws UserRegistrationException {
        if(checkValue.isValid(PATTERN_FOR_PHONE_NUMBER, phoneNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Phone Number");
    }

    public boolean checkPassword(String password) throws UserRegistrationException {
        if(checkValue.isValid(PATTERN_FOR_PASSWORD, password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }

    public boolean checkEmail(String email) {
        return Pattern.compile(PATTERN_FOR_EMAIL).matcher(email).matches();
    }
}
