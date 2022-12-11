package MoreExercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peoples = Integer.parseInt(scanner.nextLine());
        double vipPrice = 499.99;
        double normalPrice = 249.99;
        double transport = 0;
        double ticketPrice = 0;

        switch (category) {
            case "VIP":
                if (peoples >= 1 && peoples <= 4) {
                    ticketPrice = vipPrice * peoples;
                    transport = budget * 0.25;
                } else if (peoples >= 5 && peoples <= 9) {
                    ticketPrice = vipPrice * peoples;
                    transport = budget * 0.40;
                } else if (peoples >= 10 && peoples <= 24) {
                    ticketPrice = vipPrice * peoples;
                    transport = budget * 0.50;
                } else if (peoples >= 25 && peoples <= 49) {
                    ticketPrice = vipPrice * peoples;
                    transport = budget * 0.60;
                } else if (peoples >= 50) {
                    ticketPrice = vipPrice * peoples;
                    transport = budget * 0.75;
                }
                break;

            case "Normal":
                if (peoples >= 1 && peoples <= 4) {
                    ticketPrice = normalPrice * peoples;
                    transport = budget * 0.25;
                } else if (peoples >= 5 && peoples <= 9) {
                    ticketPrice = normalPrice * peoples;
                    transport = budget * 0.40;
                } else if (peoples >= 10 && peoples <= 24) {
                    ticketPrice = normalPrice * peoples;
                    transport = budget * 0.50;
                } else if (peoples >= 25 && peoples <= 49) {
                    ticketPrice = normalPrice * peoples;
                    transport = budget * 0.60;
                } else if (peoples >= 50) {
                    ticketPrice = normalPrice * peoples;
                    transport = budget * 0.75;
                }
                break;
        }
        if (transport >= ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(transport - ticketPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(transport - ticketPrice));
        }
    }
}
