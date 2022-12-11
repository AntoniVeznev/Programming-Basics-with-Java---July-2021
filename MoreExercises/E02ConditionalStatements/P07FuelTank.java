package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());

        switch (text) {
            case "Diesel":
                if (fuel >= 25) {
                    System.out.println("You have enough " + "diesel.");
                } else if (fuel < 25) {
                    System.out.println("Fill your tank with " + "diesel!");
                }
                break;
            case "Gasoline":
                if (fuel >= 25) {
                    System.out.println("You have enough " + "gasoline.");
                } else if (fuel < 25) {
                    System.out.println("Fill your tank with " + "gasoline!");
                }
                break;
            case "Gas":
                if (fuel >= 25) {
                    System.out.println("You have enough " + "gas.");
                } else if (fuel < 25) {
                    System.out.println("Fill your tank with " + "gas!");
                }
                break;
            default:
                System.out.println("Invalid fuel!");
        }
    }
}
