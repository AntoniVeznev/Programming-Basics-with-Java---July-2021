package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFreeDays = Integer.parseInt(scanner.nextLine());

        double freeDays = countFreeDays * 127;
        double workDays = (365 - countFreeDays) * 63;
        double totalTime = freeDays + workDays;
        double norm = 30000;
        double result = Math.abs(totalTime - norm);
        double hourResult = result / 60;
        double minutesResult = result % 60;
        double h = Math.floor(hourResult);
        double m = Math.floor(minutesResult);

        if (totalTime > norm) {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", h, m);

        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", h, m);
        }

    }
}
