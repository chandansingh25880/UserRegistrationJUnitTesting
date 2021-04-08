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
    private String mobileNumber;
    private String password;

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
        String emailId = UserRegistrationDetail.getEmailId();
        UserRegistrationDetail.validateEmailId(emailId);
        String mobileNumber = UserRegistrationDetail.getMobileNumber();
        UserRegistrationDetail.validatemobileNumber(mobileNumber);
        String password = UserRegistrationDetail.getPassword();
        UserRegistrationDetail.validatepassword(password);


    }

    /*
     @Discription in this we are validate the condition for user.
     if user enter the currect email id and followed by the regex condition
   */

    private boolean validateEmailId(String emailId) {
        Pattern pattern = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emailId);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("Email id is valid");
        else
            System.out.println("Email id is not  valid");
        return matches;
    }

    /*@Description:- password must be of length at least 8 characters or more
     * */

    private boolean validatepassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your password is valid");
        else
            System.out.println("Invalid password");
        return matches;
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
 user need to enter mobile number and must follow the condition.
*/
    public String getMobileNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your mobile number");
        mobileNumber = scanner.nextLine();
        return mobileNumber;
    }

    /* @Description
    this is the condition for user if the user follow the condition
    the valid mobile number other wise invalid mobile number.
     */

    public boolean validatemobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^((\\+)?(\\d{2}[-]))?(\\d{10}){1}?$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your mobile number is valid");
        else
            System.out.println("Invalid mobile number");

        return matches;
    }

    /*@Description:- take password from user
     */
    public String getPassword() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter password");
            password = scanner.next();
        }
        return password;
    }


    public boolean validateEmail(String s) {
        Pattern pattern = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emailId);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("Email id is valid");
        else
            System.out.println("Email id is not  valid");
        return matches;
    }

    public boolean validatePasswordRules(String s) {

        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your password is valid");
        else
            System.out.println("Invalid password");
        return matches;
    }
}






