package MoreExercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double twoWallsTotal = (2 * sideWall) - (2 * window);
        double backWall = x * x;
        double entrance = 1.2 * 2;
        double totalFrontAndBack = (2 * backWall) - entrance;
        double totalArea = twoWallsTotal + totalFrontAndBack;
        double greenPaint = totalArea / 3.4;
        double twoSquareOnARoof = 2 * (x * y);
        double twoTrianglesOnARoof = 2 * (x * h / 2);
        double totalAREA2 = twoSquareOnARoof + twoTrianglesOnARoof;
        double redPaint = totalAREA2 / 4.3;
        System.out.printf("%.2f", greenPaint);
        System.out.println();
        System.out.printf("%.2f", redPaint);


    }
}
