package com.registration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrizedInvalidEmailTest {

    private String emailId;

    UserRegistration operation;

    public ParametrizedInvalidEmailTest(String emailId) {
        this.emailId = emailId;
    }

    @Before
    public void setUp() throws Exception {
        operation = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[] {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"});
    }

    @Test
    public void invalidEmailTest() {
        boolean actualOutput = operation.checkEmail(emailId);
        Assert.assertFalse(actualOutput);
    }
}
