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
    @Test
    public void lastName_Should_returnTrue(){
        String lastName = "Singavarapu";
        boolean value = usercheck.lastName(lastName);
        Assertions.assertTrue(value);
    }
    @Test
    public void lastName_Should_returnFalse(){
        String lastName = "sin";
        boolean value = usercheck.lastName(lastName);
        Assertions.assertFalse(value);

    }
    @Test
    public void email_Should_returnTrue(){
        String email = "abc.xyz@bl.co.in";
        boolean value = usercheck.email(email);
        Assertions.assertTrue(value);
    }
    @Test
    public void email_Should_returnFalse(){
        String email = "vee@one";
        boolean value = usercheck.email(email);
        Assertions.assertFalse(value);

    }
    @Test
    public void mobileNum_Should_returnTrue(){
        String mobileNum = "91 9919819801";
        boolean value = usercheck.mobileNumber(mobileNum);
        Assertions.assertTrue(value);
    }
    @Test
    public void mobileNum_Should_returnFalse(){
        String mobileNum = "85067";
        boolean value = usercheck.mobileNumber(mobileNum);
        Assertions.assertFalse(value);

    }
    @Test
    public void password_Should_returnTrue(){
        String password = "VeerSing@1";
        boolean value = usercheck.password(password);
        Assertions.assertTrue(value);
    }
    @Test
    public void password_Should_returnFalse(){
        String password = "veersing";
        boolean value = usercheck.password(password);
        Assertions.assertFalse(value);

    }

}
