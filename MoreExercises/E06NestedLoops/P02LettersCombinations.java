package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String begin = scanner.nextLine();
        String end = scanner.nextLine();
        String ignore = scanner.nextLine();

        char beg = begin.charAt(0);
        char en = end.charAt(0);
        char ign = ignore.charAt(0);

        int count = 0;

        for (int i = beg; i <= en; i++) {
            for (int j = beg; j <= en; j++) {
                for (int k = beg; k <= en; k++) {

                    char symbol1 = (char) i;
                    char symbol2 = (char) j;
                    char symbol3 = (char) k;

                    if (symbol1!=ign && symbol2!=ign && symbol3!=ign){
                        count++;
                        System.out.print(symbol1);
                        System.out.print(symbol2);
                        System.out.print(symbol3);
                        System.out.print(" ");
                    }
                }
            }
        }
        System.out.println(count);
    }
}
