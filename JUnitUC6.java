package com.bridgelabz.junit;
// As a user need to follow pre-defined Password Rules. Rule 2 - should have at least one Uppercase
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JUnitUC6 {
    public static void main(String[] args) {
        Pattern passwordRule2 = Pattern.compile("[a-zA-Z]{8}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String password = sc.next();

        Matcher match = passwordRule2.matcher(password);
        if (match.find()) {
            System.out.println("Entered password is : " + password);
        } else {
            System.out.println("invalid password");
        }
    }
}
