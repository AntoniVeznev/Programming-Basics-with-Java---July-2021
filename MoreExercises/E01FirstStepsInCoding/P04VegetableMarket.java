package MoreExercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kiloVegetables = Integer.parseInt(scanner.nextLine());
        int kiloFruits = Integer.parseInt(scanner.nextLine());
        double a = priceVegetables * kiloVegetables;
        double b = priceFruits * kiloFruits;
        double totalSum = (a + b) / 1.94;
        System.out.printf("%.2f", totalSum);
    }
}
