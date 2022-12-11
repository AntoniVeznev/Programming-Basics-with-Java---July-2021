package MoreExercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String typeOfTheCar = "";
        String classOfTheCar = "";
        double carPrice = 0;

        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    classOfTheCar = "Economy class";
                    typeOfTheCar = "Cabrio";
                    carPrice = budget * 0.35;
                } else if (budget > 100 && budget <= 500) {
                    classOfTheCar = "Compact class";
                    typeOfTheCar = "Cabrio";
                    carPrice = budget * 0.45;
                } else if (budget > 500) {
                    classOfTheCar = "Luxury class";
                    typeOfTheCar = "Jeep";
                    carPrice = budget * 0.90;
                }
                break;
            case "Winter":
                if (budget <= 100) {
                    classOfTheCar = "Economy class";
                    typeOfTheCar = "Jeep";
                    carPrice = budget * 0.65;
                } else if (budget > 100 && budget <= 500) {
                    classOfTheCar = "Compact class";
                    typeOfTheCar = "Jeep";
                    carPrice = budget * 0.80;
                } else if (budget > 500) {
                    classOfTheCar = "Luxury class";
                    typeOfTheCar = "Jeep";
                    carPrice = budget * 0.90;
                }
                break;
        }
        System.out.printf("%s\n", classOfTheCar);
        System.out.printf("%s - %.2f", typeOfTheCar, carPrice);
    }
}
