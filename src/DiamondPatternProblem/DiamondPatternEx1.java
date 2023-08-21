package DiamondPatternProblem;

import java.util.Scanner;

public class DiamondPatternEx1 {
    public static void main(String[] args) {
        System.out.println("Enter your Rows number");
        Scanner scanner = new Scanner(System.in);

        int Rows = scanner.nextInt();

        for (int i = 0; i <= Rows; i++) {
            for (int j = 0; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
