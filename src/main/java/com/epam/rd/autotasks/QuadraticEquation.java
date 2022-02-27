package com.epam.rd.autotasks;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        final int DISCRIMINANT_AC_MULTIPLIER = 4;
        final int QUOTIENT_MULTIPLIER = 2;
        final double DOUBLE_MARGIN = 1E-7;
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - (DISCRIMINANT_AC_MULTIPLIER * a * c);
        System.out.println(d);
        if (Math.abs(d) < DOUBLE_MARGIN)  {
            System.out.println(-b / (QUOTIENT_MULTIPLIER * a));
        } else if (d > 0) {
            System.out.println((-b + sqrt(d)) / (QUOTIENT_MULTIPLIER * a));
            System.out.print((-b - sqrt(d)) / (QUOTIENT_MULTIPLIER * a));
        } else {
            System.out.println("no roots");
        }
    }

}
