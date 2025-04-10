package com.pluralsight;
import java.util.Scanner;
public class grosspay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter Your Name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter Your WorkedHours: ");
        Float WorkedHoures = scanner.nextFloat();

        System.out.print("PayRate ");
        Float PayRate = scanner.nextFloat(); 

        System.out.printf("YourName: %s, PayRate: %f", Name, PayRate * WorkedHoures);


    }
}
