package MoreExercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double priceNights = 0;
        double discount = 0;
        String sports = "";

        switch (season) {
            case "Winter":
                if (gender.equals("girls")) {
                    price = 9.60;
                    sports = "Gymnastics";
                    priceNights = price * students * nights;
                } else if (gender.equals("boys")) {
                    price = 9.60;
                    sports = "Judo";
                    priceNights = price * students * nights;
                } else if (gender.equals("mixed")) {
                    price = 10.0;
                    sports = "Ski";
                    priceNights = price * students * nights;
                }

                break;
            case "Spring":
                if (gender.equals("girls")) {
                    price = 7.20;
                    sports = "Athletics";
                    priceNights = price * students * nights;
                } else if (gender.equals("boys")) {
                    price = 7.20;
                    sports = "Tennis";
                    priceNights = price * students * nights;
                } else if (gender.equals("mixed")) {
                    price = 9.50;
                    sports = "Cycling";
                    priceNights = price * students * nights;
                }

                break;
            case "Summer":
                if (gender.equals("girls")) {
                    price = 15.0;
                    sports = "Volleyball";
                    priceNights = price * students * nights;
                } else if (gender.equals("boys")) {
                    price = 15.0;
                    sports = "Football";
                    priceNights = price * students * nights;
                } else if (gender.equals("mixed")) {
                    price = 20.0;
                    sports = "Swimming";
                    priceNights = price * students * nights;
                }

                break;
        }
        if (students >= 50) {
            discount = priceNights * 0.50;
            System.out.printf("%s %.2f lv.", sports, discount);
        } else if (students >= 20 && students < 50) {
            discount = priceNights * 0.85;
            System.out.printf("%s %.2f lv.", sports, discount);
        } else if (students >= 10 && students < 20) {
            discount = priceNights * 0.95;
            System.out.printf("%s %.2f lv.", sports, discount);
        } else {
            System.out.printf("%s %.2f lv.", sports, priceNights);
        }


    }
}
