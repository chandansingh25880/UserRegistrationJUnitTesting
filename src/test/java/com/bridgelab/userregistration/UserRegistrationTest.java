package com.bridgelab.userregistration;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationDetail userRegistrationTest = new UserRegistrationDetail();

    @Test
    public void givenFirst_whenProper_shouldReturnTrue() {
        boolean result = userRegistrationTest.validateFirstName("Cha");
        Assert.assertEquals(true, result);

    }
}