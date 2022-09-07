package regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationCheck usercheck = new UserRegistrationCheck();
    @Test
    public void firstName_Should_returnTrue(){
        String firstName = "Veerendra";
        boolean value = usercheck.firstName(firstName);
        Assertions.assertTrue(value);
    }
    @Test
    public void firstName_Should_returnFalse(){
        String firstName = "vee";
        boolean value = usercheck.firstName(firstName);
        Assertions.assertFalse(value);

    }
}
