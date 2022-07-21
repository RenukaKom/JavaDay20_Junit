package com.bridgelabz.junit;
// As a user need to enter a valid Last Name.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUC2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.next();

        Matcher match = pattern.matcher(firstName);
        if (match.find()) {
            System.out.println("Entered First Name is : " + firstName);
        } else {
            System.out.println("Invalid first name");
        }
        Pattern pattern2 = Pattern.compile("[A-Z][a-z]{2,}$");
        System.out.println("Enter your last name: ");
        String lastName = sc.next();

        Matcher match2 = pattern2.matcher(lastName);
        if (match2.find()) {
            System.out.println("Entered Last Name is : " + lastName);
        } else {
            System.out.println("Invalid last name");
        }
        System.out.println("Your full name is: " + firstName + " " + lastName);
    }
}