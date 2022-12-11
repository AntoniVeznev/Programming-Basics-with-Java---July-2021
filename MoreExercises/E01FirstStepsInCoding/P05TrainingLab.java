package MoreExercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wCM = w * 100;
        double hCM = h * 100;

        double coridor = hCM - 100;
        double desksOnARow = Math.floor(coridor / 70);

        double deskOnAColon = Math.floor(wCM / 120);

        double totalPlaces = (desksOnARow * deskOnAColon) - 3;
        System.out.printf("%.0f", totalPlaces);


    }
}
