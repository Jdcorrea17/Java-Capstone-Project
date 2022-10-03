package com.capstone.project;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principal = scan.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double interest = scan.nextDouble();
        interest = (interest / 100) / 12;
        System.out.print("Enter Time period in years : ");
        double mortgage = scan.nextInt();
        mortgage = mortgage * 12;
        double pay = Payment(principal, interest, mortgage);
        System.out.println("Payment: " + pay);
    }

    static double Payment(double p, double r, double t) {
        double m = (p * r) / (1 - Math.pow(1 + r, -t));
        m = Math.round(m * 100) / 100;
        return m;
    }
}