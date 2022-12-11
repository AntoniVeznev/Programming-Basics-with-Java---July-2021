package Exercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String seasons = scanner.nextLine();
        String where = "";
        String kindOfHollyday = "";
        double totalPrice = 0;

        if (budget <= 100) {
            where = "Bulgaria";
            if (seasons.equals("summer")) {
                kindOfHollyday = "Camp";
                totalPrice = budget * 0.3;
            } else if (seasons.equals("winter")) {
                kindOfHollyday = "Hotel";
                totalPrice = budget * 0.7;
            }
        } else if (budget > 100 && budget <= 1000) {
            where = "Balkans";
            if (seasons.equals("summer")) {
                kindOfHollyday = "Camp";
                totalPrice = budget * 0.40;
            } else if (seasons.equals("winter")) {
                kindOfHollyday = "Hotel";
                totalPrice = budget * 0.80;
            }
        } else if (budget > 1000) {
            where = "Europe";
            totalPrice = budget * 0.90;
            kindOfHollyday = "Hotel";
        }
        System.out.printf("Somewhere in %s %n", where);
        System.out.printf("%s - %.2f", kindOfHollyday, totalPrice);

    }
}
