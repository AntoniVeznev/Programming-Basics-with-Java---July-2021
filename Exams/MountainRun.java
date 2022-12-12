package Exams;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecondsFor1Metres = Double.parseDouble(scanner.nextLine());
        double mustClimb = distanceInMetres * timeInSecondsFor1Metres;
        double additionalTime = Math.floor(distanceInMetres / 50) * 30;
        double totalTimeNeeded = mustClimb + additionalTime;
        double diff = totalTimeNeeded - recordInSeconds;
        if (recordInSeconds <= totalTimeNeeded) {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        } else {
            System.out.printf(" Yes! The new record is %.2f seconds.", totalTimeNeeded);
        }
    }
}
