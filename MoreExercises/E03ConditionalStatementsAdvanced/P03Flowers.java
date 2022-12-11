package MoreExercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidays = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrica = 0;
        double totalPrice = 0;
        double increase = 0;

        int flowerCount = chrysanthemums + roses + tulips;
        double buketPrice = 2.0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = chrysanthemums * 2.00;
                rosesPrice = roses * 4.10;
                tulipsPrica = tulips * 2.50;
                totalPrice = chrysanthemumsPrice + rosesPrice + tulipsPrica;

                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = chrysanthemums * 3.75;
                rosesPrice = roses * 4.50;
                tulipsPrica = tulips * 4.15;
                totalPrice = chrysanthemumsPrice + rosesPrice + tulipsPrica;
                break;
        }
        if (holidays.equals("Y")) {
            increase = totalPrice + totalPrice * 0.150;
            if (tulips > 7 && season.equals("Spring")) {
                increase = increase * 0.95;

            } else if (roses >= 10 && season.equals("Winter")) {
                increase = increase * 0.90;

            }
            if (flowerCount > 20) {
                increase = increase * 0.80;

            }

            System.out.printf("%.2f", increase + buketPrice);

        } else if (holidays.equals("N")) {

            if (tulips > 7 && season.equals("Spring")) {
                totalPrice = totalPrice * 0.95;

            } else if (roses >= 10 && season.equals("Winter")) {
                totalPrice = totalPrice * 0.90;

            }
            if (flowerCount > 20) {
                totalPrice = totalPrice * 0.80;

            }
            System.out.printf("%.2f", totalPrice + buketPrice);
        }
    }
}