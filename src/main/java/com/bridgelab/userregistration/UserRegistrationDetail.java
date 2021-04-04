package com.bridgelab.userregistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
@Discription - Take a firstname from user.The first name must be first charater upper and has minimum 3 char must be follow the regex condition
 */
public class UserRegistrationDetail {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        firstName = scanner.nextLine();
        return firstName;

    }

    public boolean validateFirstName(String name) {
        Pattern pattern = Pattern.compile("[]A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(name);
        boolean matches = matcher.find();
        if (matches) {
            System.out.println("Your Name is valid");
        } else {
            System.out.println("Your Name is Invalid");
        }
        return matches;
    }
    public String getLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your last name");
        lastName = scanner.nextLine();
        return firstName;
    }

    public static void main(String[] args) {
        UserRegistrationDetail UserRegistrationDetail = new UserRegistrationDetail();
        String firstName = UserRegistrationDetail.getFirstName();
        UserRegistrationDetail.validateFirstName(firstName);
        String lastName = UserRegistrationDetail.getLastName();
    }
    /* @Description User enter a valid last name.
     */
    public boolean validateLastName(String sing) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(lastName);
        boolean matches = matcher.find();
        if (matches) {
            System.out.println("Your Name is valid");
        } else {
            System.out.println("Your Name is Invalid");
        }
        return matches;
    }

}

