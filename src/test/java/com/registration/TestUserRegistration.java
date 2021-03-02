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
    public void firstNameTrueTest() {
        boolean result = operation.checkFirstName("Shub");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameFalseTest() {
        boolean result = operation.checkFirstName("shub");
        Assert.assertFalse(result);
    }

    @Test
    public void lastNameTrueTest() {
        boolean result = operation.checkLastName("Kum");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameFalseTest() {
        boolean result = operation.checkLastName("ku");
        Assert.assertFalse(result);
    }

    @Test
    public void emailTrueTest() {
        boolean result = operation.checkEmail("kumar.skm03@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void emailFalseTest() {
        boolean result = operation.checkEmail("kumar.@.gmail.co.c");
        Assert.assertFalse(result);
    }

    @Test
    public void phoneNumberTrueTest() {
        boolean result = operation.checkPhoneNumber("91 8989464132");
        Assert.assertTrue(result);
    }

    @Test
    public void phoneNumberFalseTest() {
        boolean result = operation.checkPhoneNumber("19944556677");
        Assert.assertFalse(result);
    }

    @Test
    public void passwordTrueTest() {
        boolean result = operation.checkPassword("12Shu@456");
        Assert.assertTrue(result);
    }

    @Test
    public void passwordFalseTest() {
        boolean result = operation.checkPassword("Sh12^&$%");
        Assert.assertFalse(result);
    }

}
