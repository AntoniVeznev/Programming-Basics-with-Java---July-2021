package MoreExercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double S = Math.PI * (r * r);
        double P = Math.PI * (r + r);
        System.out.printf("%.2f", S);
        System.out.println();
        System.out.printf("%.2f", P);


    }
}
