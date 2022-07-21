package com.bridgelabz.junit;
// Email should clear all samples provided separately

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JUnitUC9 {
    public static void main(String[] args) {
        Pattern allPassword = Pattern.compile("[[a-z][A-Z][0-9][@][-][.][+]]*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String password = sc.next();

        Matcher match = allPassword.matcher(password);
        if (match.find()) {
            System.out.println("Entered password is : " + password);
        } else {
            System.out.println("Invalid password");
        }
    }
}
