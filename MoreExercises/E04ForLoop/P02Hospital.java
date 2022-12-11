package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int reviewed = 0;
        int notReviewed = 0;
        int doctorsNumber = 7;

        for (int i = 1; i <= input; i++) {
            int daysAndPatients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (notReviewed > reviewed) {
                    doctorsNumber++;
                }
            }

            if (doctorsNumber == daysAndPatients) {
                reviewed = reviewed + doctorsNumber;
            } else if (daysAndPatients > doctorsNumber) {
                reviewed = reviewed + doctorsNumber;
                notReviewed = notReviewed + daysAndPatients - doctorsNumber;
            } else {
                int diff = Math.abs(doctorsNumber - daysAndPatients);
                reviewed = (reviewed + doctorsNumber) - diff;
            }

        }
        System.out.printf("Treated patients: %d.\n", reviewed);
        System.out.printf("Untreated patients: %d.", notReviewed);

    }
}
