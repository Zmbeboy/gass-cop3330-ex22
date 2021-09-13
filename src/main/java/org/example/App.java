/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String firstNumber = scan.nextLine();
        System.out.print("Enter the second number: ");
        String secondNumber = scan.nextLine();
        System.out.print("Enter the third number: ");
        String thirdNumber = scan.nextLine();

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int num3 = Integer.parseInt(thirdNumber);

        int largestNumber = num1;
        if (num2 > largestNumber) {
            largestNumber = num2;
        }
        if (num3 > largestNumber) {
            largestNumber = num3;
        }

        System.out.println(String.format("The largest number is %d.", largestNumber));

    }
}