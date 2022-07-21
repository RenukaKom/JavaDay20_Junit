package com.bridgelabz.junit;
//User needs to enter a valid email
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JUnitUC3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-z.]+@[a-z.]+$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.next();

        Matcher match = pattern.matcher(email);
        if (match.find()) {
            System.out.println("Entered email is : " + email);
        } else {
            System.out.println("Invalid email");
        }
    }
}
