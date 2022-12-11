package Exercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());

        double rate = depositSum * (percentPerYear / 100);
        double ratePerMonth = rate / 12;
        double totalSum = depositSum + (months * ratePerMonth);

        System.out.println(totalSum);


    }

}
