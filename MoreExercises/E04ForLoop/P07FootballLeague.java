package MoreExercises.E04ForLoop;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;

        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    countA++;

                    break;
                case "B":
                    countB++;

                    break;
                case "V":
                    countV++;

                    break;
                case "G":
                    countG++;

                    break;
            }
        }
        double percent1 = 1.0 * countA / fans * 100;
        double percent2 = 1.0 * countB / fans * 100;
        double percent3 = 1.0 * countV / fans * 100;
        double percent4 = 1.0 * countG / fans * 100;
        double all = 1.0 * fans / capacity * 100;
        System.out.printf("%.2f%%\n", percent1);
        System.out.printf("%.2f%%\n", percent2);
        System.out.printf("%.2f%%\n", percent3);
        System.out.printf("%.2f%%\n", percent4);
        System.out.printf("%.2f%%", all);

    }
}
