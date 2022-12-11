package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double taxiDay = 0.70 + (0.79 * km);
        double taxiNight = 0.70 + (0.90 * km);
        double busDayAndNight = 0.09 * km;
        double trainDayAndNight = 0.06 * km;
        if (dayOrNight.equals("day")) {
            if (km >= 100) {
                System.out.printf("%.2f", trainDayAndNight);
            } else if (km >= 20) {
                System.out.printf("%.2f", busDayAndNight);
            } else {
                System.out.printf("%.2f", taxiDay);
            }
        } else if (dayOrNight.equals("night")) {
            if (km >= 100) {
                System.out.printf("%.2f", trainDayAndNight);
            } else if (km >= 20) {
                System.out.printf("%.2f", busDayAndNight);
            } else {
                System.out.printf("%.2f", taxiNight);
            }
        }
    }
}
