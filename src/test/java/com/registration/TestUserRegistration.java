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
}
