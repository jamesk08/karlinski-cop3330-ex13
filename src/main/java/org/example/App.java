/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principal = scanner.nextDouble();

        System.out.print("What is the rate? ");
        double rate = scanner.nextDouble();

        System.out.print("What is the number of years? ");
        int years = scanner.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = scanner.nextInt();

        final int one = 1;
        final double hundred = 100;
        double result = principal * Math.pow((one + ((rate / hundred) / compound)), (compound * years));

        DecimalFormat moneyFormatter = new DecimalFormat("#,##0.00");
        String displayMessage = MessageFormat.format(
            "${0} invested at {1}% for {2} years compounded {3} times per year is ${4}.",
            moneyFormatter.format(principal),
            rate,
            years,
            compound,
            moneyFormatter.format(result)
        );

        System.out.println(displayMessage);
    }
}