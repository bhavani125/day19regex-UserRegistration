package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    public static final String namePattern = "[A-Z]{1}[A-Za-z]{2,}";
    public static final String emailPattern ="([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";
    public static final String numberPattern="^[+0-9]{2}{10}$";
    //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        //Creating object for userRegistration class
        UserRegistration userRegistration = new UserRegistration();
        //calling readInput method here
        userRegistration.readInput();
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
