package Exercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (nights > 7 && nights <= 14) {
                    priceStudio *= 0.95;
                } else if (nights >= 14) {
                    priceStudio *= 0.70;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (nights > 14) {
                    priceStudio *= 0.80;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }
        if (nights > 14) {
            priceApartment *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment * nights);

        System.out.printf("Studio: %.2f lv.", priceStudio * nights);

    }
}
