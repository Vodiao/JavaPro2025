package lesson1;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    private static final double CONV_K = 2.204062;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0. ");
        System.out.println();
        System.out.println("Please enter kgs: ");
        double kgs = sc.nextDouble();
        System.out.println("Please enter pounds: ");
        double pnds = sc.nextDouble();
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Result is " + pounds + " pounds and " + kilos + " kgs.");
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pnds) {
        return pnds / CONV_K;
    }

}