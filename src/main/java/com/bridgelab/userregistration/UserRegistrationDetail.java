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
    private String emailId;
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

    /* @Description take a email id by user and return emailid.
     */
    public String getEmailId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your email");
        emailId = scanner.nextLine();
        return emailId;
    }
 /*
   @Discription in this we are validate the condition for user.
   if user enter the currect email id and followed by the regex condition
 */
        public boolean validateEmail(String emailId) {
            Pattern pattern = Pattern.compile(
                    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                    Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(emailId);
            boolean matches = matcher.find();
            if(matches)
                System.out.println("Email id is valid");
            else
                System.out.println("Email id is not  valid");
            return matches;
        }

    }


