package MoreExercises.E03ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int young = Integer.parseInt(scanner.nextLine());
        int old = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        double priceYoung = 0;
        double priceOld = 0;
        double totalSum = 0;
        double expenses = 0;
        int totalPeople = young + old;
        switch (type) {
            case "trail":
                priceYoung = 5.50;
                priceOld = 7.0;
                totalSum = young * priceYoung + old * priceOld;
                expenses = totalSum * 0.95;
                break;
            case "road":
                priceYoung = 20.0;
                priceOld = 21.50;
                totalSum = young * priceYoung + old * priceOld;
                expenses = totalSum * 0.95;
                break;
            case "cross-country":
                priceYoung = 8.0;
                priceOld = 9.50;
                totalSum = young * priceYoung + old * priceOld;
                expenses = totalSum * 0.95;
                if (totalPeople >= 50) {
                    expenses = expenses * 0.75;
                }
                break;
            case "downhill":
                priceYoung = 12.25;
                priceOld = 13.75;
                totalSum = young * priceYoung + old * priceOld;
                expenses = totalSum * 0.95;
                break;
        }
        System.out.printf("%.2f", expenses);
    }
}
