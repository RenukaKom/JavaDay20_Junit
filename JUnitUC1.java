package com.bridgelabz.junit;
// As a user need to enter a valid First Name.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JUnitUC1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.next();

        Matcher match = pattern.matcher(firstName);
        if (match.find()) {
            System.out.println("Entered First Name is : " + firstName);
        } else {
            System.out.println("Invalid name");
        }
    }
}