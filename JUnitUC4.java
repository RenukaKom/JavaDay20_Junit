package com.bridgelabz.junit;
// As a user need to follow pre-defined Mobile Format
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JUnitUC4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(\\+91|91|0)?[6-9][0-9]{9}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mobile Number: ");
        String mobileNumber = sc.next();

        Matcher match = pattern.matcher(mobileNumber);
        if (match.find()) {
            System.out.println("Entered Mobile Number is : " + mobileNumber);
        } else {
            System.out.println("invalid phone number");
        }
    }
}