package MoreExercises.E02ConditionalStatements;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolValue = Integer.parseInt(scanner.nextLine());
        int waterForOneHourInThePipe = Integer.parseInt(scanner.nextLine());
        int waterForTwoHourInThePipe = Integer.parseInt(scanner.nextLine());
        double numberOfHoursThatTheWorkerIsNotThere = Double.parseDouble(scanner.nextLine());

        double timeFirstPipe = waterForOneHourInThePipe * numberOfHoursThatTheWorkerIsNotThere;
        double timeSecondPipe = waterForTwoHourInThePipe * numberOfHoursThatTheWorkerIsNotThere;
        double totalCapacityFor1Hour = timeFirstPipe + timeSecondPipe;

        double totalPercent = (totalCapacityFor1Hour * 100) / poolValue;
        double percentOne = (timeFirstPipe * 100) / totalCapacityFor1Hour;
        double percentTwo = (timeSecondPipe * 100) / totalCapacityFor1Hour;
        double diff = Math.abs(poolValue - totalCapacityFor1Hour);

        if (totalCapacityFor1Hour <= poolValue) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPercent, percentOne, percentTwo);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", numberOfHoursThatTheWorkerIsNotThere, diff);
        }


    }
}
