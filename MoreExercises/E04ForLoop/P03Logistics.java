package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWeight = Integer.parseInt(scanner.nextLine());
        double busPrice = 0;
        double truckPrice = 0;
        double trainPrice = 0;
        int allWeight = 0;
        double middle = 0;
        int busCount = 0;
        int truckCount = 0;
        int trainCount = 0;
        double bp = 0;
        double tp = 0;
        double trp = 0;

        for (int i = 1; i <= numberOfWeight; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            allWeight += tons;
            if (tons <= 3) {
                busPrice += (200 * tons);
                busCount += tons;
            } else if (tons <= 11) {
                truckPrice += (175 * tons);
                truckCount += tons;
            } else {
                trainPrice += (120 * tons);
                trainCount += tons;
            }

        }
        middle = (busPrice + truckPrice + trainPrice) / allWeight;

        bp = (1.0 * busCount / allWeight) * 100;
        tp = (1.0 * truckCount / allWeight) * 100;
        trp = (1.0 * trainCount / allWeight) * 100;

        System.out.printf("%.2f\n", middle);
        System.out.printf("%.2f%%\n", bp);
        System.out.printf("%.2f%%\n", tp);
        System.out.printf("%.2f%%", trp);

    }
}
