package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to convert Fahrenheit to Celsius: ");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("Temperature in Celsius:" + celsius);
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Temperature in Fahrenheit:" + fahrenheit);
        } else {
            System.out.println("Wrong choice.");
        }

    }
}