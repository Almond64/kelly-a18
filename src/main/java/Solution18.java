/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String choice = input.next();
        //System.out.printf("%s\n", choice);
        if (choice.equals("C")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double tempF = input.nextDouble();
            //convert from Celsius to Fahrenheit
            double tempC = (tempF-32)*5/9;
            System.out.printf("The temperature in Celsius is %.2f.\n", tempC);
        } else {
            System.out.print("Please enter the temperature in Celsius: ");
            double tempC = input.nextDouble();
            //convert from Celsius to Fahrenheit
            double tempF = (tempC*9/5)+32;
            System.out.printf("The temperature in Celsius is %.2f.\n", tempF);
        }
    }
}
