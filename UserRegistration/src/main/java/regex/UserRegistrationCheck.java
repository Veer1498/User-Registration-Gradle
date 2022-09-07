package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Given : User Registration System needs to ensure all validations are in place during the User Entry.
 * Author : Veer
 */

//User Registration Class
public class UserRegistrationCheck {
    Scanner sc = new Scanner(System.in);

    //Welcome Function
    public void welcome(){
        System.out.println("Welcome to User Registration Program");
        System.out.println("====================================");
    }
    //firstName Function
    public boolean firstName(String firstName){
        System.out.println("Please Enter Valid First Name");
        System.out.println(firstName);
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",firstName));
        return  Pattern.matches("[A-Z][a-z]{3,}",firstName);
    }
    //LastName Function
    public boolean lastName() {
        System.out.println("Please Enter Valid Last Name");
        String lastName = "Singavarapu";
        System.out.println(lastName);
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}", lastName));

        return Pattern.matches("[A-Z][a-z]{3,}", lastName);
    }
    //Email Function
    public boolean email() {
        System.out.println("Please Enter Valid Email");
        String email = "abc.xyz@bl.co.in"; //given : abc.xyz@bl.co.in
        System.out.println(email);
        System.out.println(Pattern.matches("[a-z]*.[a-z]*@[b]+[l]+.[c]+[o]+.[i]+[n]+", email));
        return Pattern.matches("[a-z]*.[a-z]*@[b]+[l]+.[c]+[o]+.[i]+[n]+", email);
    }
    //Mobile Number Function
    public boolean mobileNumber() {
        System.out.println("Please Enter Valid Mobile Number");
        String number = "91 9919819801"; //given : 91 9919819801
        System.out.println(number);
        System.out.println(Pattern.matches("[0-9]{2}[\\s]+[0-9]{10}", number));
        return (Pattern.matches("[0-9]{2}[\s]+[0-9]{10}", number));
    }
    //password Function
    public boolean password() {
        System.out.println("Please Enter Valid Password");
        String password = "VeerSing@1";
        System.out.println(password);
        System.out.println(Pattern.matches("[A-Z]+[A-z0-9]{6,}[@]+[0-9]+", password));
        return Pattern.matches("[A-Z]+[A-z0-9]{6,}[@]+[0-9]+", password);
    }
    public boolean emailsCheck(){
        System.out.println("Please Enter Sample Emails Given");
        String emails = "xyz@gmail.com";
        System.out.println(emails);
        System.out.println(Pattern.matches("[A-z0-9.]*[.+-]?[A-z0-9.]*[@]+[a-z0-9]*[.]+[a-z]{2,}([.]+[a-z]{2,})?", emails));
        return Pattern.matches("[A-z0-9.]*[.+-]?[A-z0-9.]*[@]+[a-z0-9]*[.]+[a-z]{2,}([.]+[a-z]{2,})?", emails);
    }
}
