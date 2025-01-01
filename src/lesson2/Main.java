package lesson2;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    private static final double CONV_MILES_TO_KM = 1.609;

    public static void main(String[] args) {
        System.out.println("App for distance converting.");
        System.out.println("Version 1.0. ");
        System.out.println();
        System.out.println("Please enter miles : ");

        double mil = sc.nextDouble();

        System.out.println("Please enter kilometers : ");
        double km = sc.nextDouble();

        double kilometers = convertMilesToKilometers(mil);
        System.out.println("Converted miles to kilometers: " + kilometers + " km");
        System.out.println();
        double miles = convertKilometersToMiles(km);
        System.out.println("Converted kilometers to miles: " + miles + " miles");

    }

    private static double convertMilesToKilometers(double mil) {
        return mil * CONV_MILES_TO_KM;
    }

    private static double convertKilometersToMiles(double km) {
        return km / CONV_MILES_TO_KM;
    }
}