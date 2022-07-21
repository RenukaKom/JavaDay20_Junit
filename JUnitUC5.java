package com.bridgelabz.junit;
// As a user need to follow pre-defined Password Rules. Rule 1 - minimum 8 characters
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JUnitUC5 {
    public static void main(String[] args) {
        Pattern passwordRule1 = Pattern.compile("[a-z]{8}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String password = sc.next();

        Matcher match = passwordRule1.matcher(password);
        if (match.find()) {
            System.out.println("Entered password is : " + password);
        } else {
            System.out.println("invalid password");
        }
    }
}
