package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maleCount = Integer.parseInt(scanner.nextLine());
        int femaleCount = Integer.parseInt(scanner.nextLine());
        int tablesCount = Integer.parseInt(scanner.nextLine());

        int table = 0;
        boolean letsBrakeIt = false;
        for (int i = 1; i <= maleCount; i++) {
            for (int j = 1; j <= femaleCount; j++) {

                table++;
                System.out.printf("(%d <-> %d) ", i, j);

                if (table >= tablesCount) {
                    letsBrakeIt=true;
                    break;
                }
            }
            if (letsBrakeIt){
                break;
            }
        }
    }
}
