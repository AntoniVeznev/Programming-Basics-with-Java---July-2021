package MoreExercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String locations = "";
        String places = "";

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    places = "Camp";
                    locations = "Alaska";
                    price = budget * 0.65;
                } else if (budget > 1000 && budget <= 3000) {
                    places = "Hut";
                    locations = "Alaska";
                    price = budget * 0.80;
                } else if (budget > 3000) {
                    places = "Hotel";
                    locations = "Alaska";
                    price = budget * 0.90;
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    places = "Camp";
                    locations = "Morocco";
                    price = budget * 0.45;
                } else if (budget > 1000 && budget <= 3000) {
                    places = "Hut";
                    locations = "Morocco";
                    price = budget * 0.60;
                } else if (budget > 3000) {
                    places = "Hotel";
                    locations = "Morocco";
                    price = budget * 0.90;
                }
                break;
        }
        System.out.printf("%s - %s - %.2f", locations, places, price);
    }
}
