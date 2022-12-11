package MoreExercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double skumriqKG = Double.parseDouble(scanner.nextLine());
        double cacaKG = Double.parseDouble(scanner.nextLine());
        double palamudKG = Double.parseDouble(scanner.nextLine());
        double safridKG = Double.parseDouble(scanner.nextLine());
        int midiKG = Integer.parseInt(scanner.nextLine());
        double palamudPrice = skumriqKG + skumriqKG * 0.60;
        double palamudSum = palamudKG * palamudPrice;
        double safridPrice = cacaKG + cacaKG * 0.80;
        double safridSum = safridKG * safridPrice;
        double midiSum = midiKG * 7.50;
        double totalSum = palamudSum + safridSum + midiSum;
        System.out.printf("%.2f", totalSum);
    }
}
