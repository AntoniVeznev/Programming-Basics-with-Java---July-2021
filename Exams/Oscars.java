package Exams;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int numberOfJuri = Integer.parseInt(scanner.nextLine());
        double allPoints = points;
        for (int i = 0; i < numberOfJuri; i++) {
            String name = scanner.nextLine();
            double pointsOfName = Double.parseDouble(scanner.nextLine());
            double letter = name.length();
            allPoints = allPoints + (letter * pointsOfName) / 2;
            if (allPoints > 1250.5) {
                break;
            }
        }
        double diff = Math.abs(allPoints - 1250.5);

        if (allPoints <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        } else if (allPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, allPoints);

        }

    }
}
