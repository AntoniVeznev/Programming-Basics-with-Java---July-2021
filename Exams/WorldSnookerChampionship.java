package Exams;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String ticket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double ticketPrice = 0;
        double priceTickets = 0;

        if (text.equals("Quarter final")) {
            if (ticket.equals("Standard")) {
                ticketPrice = 55.50;
                priceTickets = countTickets * ticketPrice;
            } else if (ticket.equals("Premium")) {
                ticketPrice = 105.20;
                priceTickets = countTickets * ticketPrice;
            } else {
                ticketPrice = 118.90;
                priceTickets = countTickets * ticketPrice;
            }
        }
        if (text.equals("Semi final")) {
            if (ticket.equals("Standard")) {
                ticketPrice = 75.88;
                priceTickets = countTickets * ticketPrice;
            } else if (ticket.equals("Premium")) {
                ticketPrice = 125.22;
                priceTickets = countTickets * ticketPrice;
            } else {
                ticketPrice = 300.40;
                priceTickets = countTickets * ticketPrice;
            }
        }
        if (text.equals("Final")) {
            if (ticket.equals("Standard")) {
                ticketPrice = 110.10;
                priceTickets = countTickets * ticketPrice;
            } else if (ticket.equals("Premium")) {
                ticketPrice = 160.66;
                priceTickets = countTickets * ticketPrice;
            } else {
                ticketPrice = 400;
                priceTickets = countTickets * ticketPrice;
            }
        }

        if (priceTickets > 4000) {
            priceTickets = priceTickets * 0.75;
        } else if (priceTickets > 2500) {
            priceTickets = priceTickets * 0.90;
            if (symbol.equals("Y")) {
                priceTickets = priceTickets + (countTickets * 40);
            } else {
                priceTickets = priceTickets * 0.90;
            }
        } else {
            if (symbol.equals("Y")) {
                priceTickets = priceTickets + (countTickets * 40);
            } else {
                priceTickets = priceTickets + (countTickets * 40);
                priceTickets = priceTickets - (countTickets * 40);

            }
        }
        System.out.printf("%.2f", priceTickets);

    }
}
