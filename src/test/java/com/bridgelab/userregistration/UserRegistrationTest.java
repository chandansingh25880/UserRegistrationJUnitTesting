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

    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userRegistrationTest.validateLastName("Sing");
        Assert.assertEquals(result, true);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistrationTest.validateEmail("Chandan@gmail.com");
        Assert.assertTrue(String.valueOf(result), true);
    }

    @Test
    public void givenmobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistrationTest.validatemobileNumber("91 8887719063");
        Assert.assertTrue(String.valueOf(result), true);

    }

    @Test
    public void givenPasswordRules_WhenProperRules_ShouldReturnTrue() {
        boolean result = userRegistrationTest.validatePasswordRules("AShuu@14");
        Assert.assertTrue(String.valueOf(result),true);
    }
}