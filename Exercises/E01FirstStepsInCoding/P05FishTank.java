package Exercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P05FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int value = length * width * high;
        double totalLitres = value * 0.001;
        double secondPercent = percent * 0.01;
        double neededLiters = totalLitres * (1 - secondPercent);

        System.out.printf("%.2f", neededLiters);


    }
}
