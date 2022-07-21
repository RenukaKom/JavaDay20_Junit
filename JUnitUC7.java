package com.bridgelabz.junit;
// As a user need to follow pre-defined Password Rules. Rule 3 - should have at least one Numeric value
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JUnitUC7 {
    public static void main(String[] args) {
        Pattern passwordRule3 = Pattern.compile("[[a-z][A-Z][0-9]]{8}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String password = sc.next();

        Matcher match = passwordRule3.matcher(password);
        if (match.find()) {
            System.out.println("Entered password is : " + password);
        } else {
            System.out.println("invalid password");
        }
    }
}
