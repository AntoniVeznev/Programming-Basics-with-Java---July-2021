package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastSector = scanner.nextLine();
        int countRowsFirstSector = Integer.parseInt(scanner.nextLine());
        int countPlacesOddRows = Integer.parseInt(scanner.nextLine());
        char startSectorA = lastSector.charAt(0);
        int counter = 0;
        int successfulCombinations = 0;
        for (int i = 65; i <= startSectorA; i++) {
            char symbol1 = (char) i;
            if (i == 65) {
                for (int j = 1; j <= countRowsFirstSector; j++) {
                    counter++;
                    if (j % 2 != 0) {
                        for (int k = 97; k < 97 + countPlacesOddRows; k++) {
                            char symbol2 = (char) k;
                            successfulCombinations++;
                            System.out.printf("%c%d%c\n", symbol1, j, symbol2);
                        }
                    } else if (j % 2 == 0) {
                        for (int k = 97; k < 97 + 2 + countPlacesOddRows; k++) {
                            char symbol2 = (char) k;
                            successfulCombinations++;
                            System.out.printf("%c%d%c\n", symbol1, j, symbol2);
                        }
                    }
                }
            } else if (i > 65) {
                counter++;
                for (int j = 1; j <= counter; j++) {
                    if (j % 2 != 0) {
                        for (int k = 97; k < 97 + countPlacesOddRows; k++) {
                            char symbol2 = (char) k;
                            successfulCombinations++;
                            System.out.printf("%c%d%c\n", symbol1, j, symbol2);
                        }
                    } else if (j % 2 == 0) {
                        for (int k = 97; k < 97 + 2 + countPlacesOddRows; k++) {
                            char symbol2 = (char) k;
                            successfulCombinations++;
                            System.out.printf("%c%d%c\n", symbol1, j, symbol2);
                        }
                    }
                }
            }
        }
        System.out.println(successfulCombinations);
    }
}
