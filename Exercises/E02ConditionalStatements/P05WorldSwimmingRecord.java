package Exercises.E02ConditionalStatements;

import java.util.Scanner;

public class P05WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double ivansTime = distance * time;
        double waterLag = Math.floor(distance / 15) * 12.5;
        double totalTime = ivansTime + waterLag;
        if (record > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        }
    }
}
