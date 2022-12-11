package Exercises.E06NestedLoops;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        boolean letsBrakeIt = false;
        for (int row = 1; row <= number; row++) {
            System.out.println();
            for (int colon = 1; colon <= row; colon++) {
                System.out.print(counter + " ");
                if (counter == number) {
                    letsBrakeIt = true;
                    break;
                }
                counter++;
            }
            if (letsBrakeIt) {
                break;
            }

        }
    }
}
