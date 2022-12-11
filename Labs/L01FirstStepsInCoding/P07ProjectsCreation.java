package Labs.L01FirstStepsInCoding;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameArchitect = scanner.nextLine();
        int projectCount = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = projectCount * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameArchitect, hoursNeeded, projectCount);
    }
}
