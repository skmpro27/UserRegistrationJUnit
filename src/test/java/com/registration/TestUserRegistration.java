package com.registration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUserRegistration{

    UserRegistration operation;

    @Before
    public void setUp(){
        operation = new UserRegistration();
    }

    @Test
    public void firstNameTrueTest() throws UserRegistrationException {
            boolean result = operation.checkFirstName("Shub");
            Assert.assertTrue(result);
    }

    @Test
    public void firstNameFalseTest() {
        try {
            operation.checkFirstName("shub");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid First Name",e.getMessage());
        }
    }

    @Test
    public void lastNameTrueTest() throws UserRegistrationException {
        boolean result = operation.checkLastName("Kub");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameFalseTest() {
        try {
            operation.checkLastName("Ku");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Last Name", e.getMessage());
        }
    }

    @Test
    public void emailTrueTest() throws UserRegistrationException {
        boolean result = operation.checkEmailId("kumar.skm@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void emailFalseTest() {
        try {
            operation.checkEmailId("kumar.@.gmail.co.o");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Email",e.getMessage());
        }
    }

    @Test
    public void phoneNumberTrueTest() throws UserRegistrationException {
        boolean result = operation.checkPhoneNumber("91 9111649077");
        Assert.assertTrue(result);
    }

    @Test
    public void phoneNumberFalseTest() {
        try {
            operation.checkPhoneNumber("19944556677");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Phone Number",e.getMessage());
        }
    }

    @Test
    public void passwordTrueTest() throws UserRegistrationException {
        boolean result = operation.checkPassword("Sh$345hj");
        Assert.assertTrue(result);
    }

    @Test
    public void passwordFalseTest() {
        try {
            operation.checkPassword("Sh12^&$%");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Password",e.getMessage());
        }
    }

}
