package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    public static final String namePattern = "[A-Z]{1}[A-Za-z]{2,}";
    public static final String emailPattern ="([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";
    public static final String numberPattern="^[+0-9]{2}{10}$";
    public static final String passwordPattern = "[0-9a-zA-Z!@#$%^&*]{8,}";
    public static final String numericPwdPattern ="^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@$!%*#?&]{6,}$";
    public static final String specialCharPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
    //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        //Creating object for userRegistration class
        UserRegistration userRegistration = new UserRegistration();
        //calling readInput method here
        userRegistration.readInput();
        userRegistration.EmailPatternTest();
    }
    //Creating EmailPatternTest method for all email samples
    private void EmailPatternTest() {
        String sampleEmail1 = "abc@yahoo.com";
        String sampleEmail2 = "abc-100@yahoo.com";
        String sampleEmail3 = "abc.100@yahoo.com";
        String sampleEmail4 = "abc111@abc.com";
        String sampleEmail5 = "abc-100@abc.net";
        String sampleEmail6 = "abc.100@abc.com.au";
        String sampleEmail7 = "abc@1.com";
        String sampleEmail8 = "abc@gmail.com.com";
        String sampleEmail9 = "abc+100@gmail.com";
        //Creating arrayList
        ArrayList<String> emailIdList = new ArrayList<String>();
        emailIdList.add(sampleEmail1);
        emailIdList.add(sampleEmail2);
        emailIdList.add(sampleEmail3);
        emailIdList.add(sampleEmail4);
        emailIdList.add(sampleEmail5);
        emailIdList.add(sampleEmail6);
        emailIdList.add(sampleEmail7);
        emailIdList.add(sampleEmail8);
        emailIdList.add(sampleEmail9);

        for (String emailId : emailIdList)
        {
            if (Pattern.matches(emailPattern, emailId))
            {
                System.out.println(emailId + " - valid ");
            }
            else
            {
                System.out.println(emailId + " - Invalid ");
            }
        }
    }

    //Creating readInput method to take input from user
    private void readInput()
    {

        System.out.println("Enter first name ");
        String firstName = sc.next();
        //calling validateInput method
        validateInput(namePattern, firstName);

        System.out.println("Enter last name ");
        String lastName = sc.next();
        //calling validateInput method
        validateInput(namePattern,lastName);

        System.out.println("Enter email id ");
        String emailId = sc.next();
        //calling validateInputmethod
        validateInput(emailPattern,emailId);

        System.out.println("Enter phoneNumber");
        String phoneNumber = sc.next();
        //calling validateInput method
        validateInput(numberPattern,phoneNumber);

        System.out.println("Enter a password");
        String password1 = sc.next();
        //calling validateInput method
        validateInput(passwordPattern,password1);

        System.out.println("Enter the password atleast one upperCase");
        String password2 = sc.next();
        //calling validateInput method
        validateInput(passwordPattern,password2);

        System.out.println("Enter the numeric password pattern");
        String password3 = sc.next();
        //calling validateInput method
        validateInput(numericPwdPattern,password3);

        System.out.println("Enter a password having  exactly one special character");
        String password4 = sc.next();
        //calling validateInput method
        validateInput(specialCharPattern,password4);

    }
    //Creating validateInput method  is to check
    private void validateInput(String pattern, String input) {
        if (Pattern.matches(pattern, input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
