package com.pluralsight;
import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;
public class fastFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float regularSize = 5.45f;
        float largeSize = 8.95f;
        System.out.println("Wealcome!");
        System.out.print("Name:");
        String name = scanner.nextLine();
        System.out.print("Choose Your Option (Enter 1 for Regular)(Enter 2 for Large):");
        int option = scanner.nextInt();
        System.out.print("Please enter your age for diacount:");
        int age = scanner.nextInt();

        float base = 0f;
        if (option == 1) {
            base = regularSize;
        } else if (option == 2) {
            base = largeSize;
        } else {
            System.out.println("Pleas choose correct option");
        }

        double discount = 0.0;
        if (age <= 17) {
            discount = .10;
        } else if (age >= 65) {
            discount = .20;
        }
        System.out.printf("Your total is: %.2f", base * (1 - discount));


    }
}

