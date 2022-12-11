package MoreExercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometres = Double.parseDouble(scanner.nextLine());
        double priceFor1kilometres = 0;
        double payment = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometres <= 5000) {
                    priceFor1kilometres = 0.75;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                } else if (kilometres > 5000 && kilometres <= 10000) {
                    priceFor1kilometres = 0.95;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                } else if (kilometres > 10000 && kilometres <= 20000) {
                    priceFor1kilometres = 1.45;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                }

                break;
            case "Summer":
                if (kilometres <= 5000) {
                    priceFor1kilometres = 0.90;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                } else if (kilometres > 5000 && kilometres <= 10000) {
                    priceFor1kilometres = 1.10;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                } else if (kilometres > 10000 && kilometres <= 20000) {
                    priceFor1kilometres = 1.45;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                }
                break;
            case "Winter":
                if (kilometres <= 5000) {
                    priceFor1kilometres = 1.05;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                } else if (kilometres > 5000 && kilometres <= 10000) {
                    priceFor1kilometres = 1.25;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                } else if (kilometres > 10000 && kilometres <= 20000) {
                    priceFor1kilometres = 1.45;
                    payment = priceFor1kilometres * kilometres * 4 * 0.90;
                }
                break;
        }
        System.out.printf("%.2f", payment);

    }
}
