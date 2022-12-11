package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P08FuelTankPart_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double priceGas = 0.93;
        double priceGasoline = 2.22;
        double priceDiesel = 2.33;

        double discountGas = 0.08;
        double discountGasoline = 0.18;
        double discountDiesel = 0.12;
        double totalSum = 0;

        switch (typeOfFuel) {
            case "Gas": {
                if (card.equals("Yes")) {
                    totalSum = (priceGas - discountGas) * fuelQuantity;
                } else if (card.equals("No")) {
                    totalSum = priceGas * fuelQuantity;
                }
                break;
            }
            case "Gasoline": {
                if (card.equals("Yes")) {
                    totalSum = (priceGasoline - discountGasoline) * fuelQuantity;
                } else if (card.equals("No")) {
                    totalSum = priceGasoline * fuelQuantity;
                }
                break;
            }
            case "Diesel": {
                if (card.equals("Yes")) {
                    totalSum = (priceDiesel - discountDiesel) * fuelQuantity;
                } else if (card.equals("No")) {
                    totalSum = priceDiesel * fuelQuantity;
                }
                break;
            }

        }
        if (fuelQuantity > 20 && fuelQuantity <= 25) {
            totalSum = totalSum * 0.92;

        } else if (fuelQuantity > 25) {
            totalSum = totalSum * 0.9;

        }
        System.out.printf("%.2f lv.", totalSum);
    }
}
