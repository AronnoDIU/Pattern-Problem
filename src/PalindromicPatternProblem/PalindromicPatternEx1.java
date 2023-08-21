package PalindromicPatternProblem;

import java.util.Scanner;

public class PalindromicPatternEx1 {
    public static void main(String[] args) {
        System.out.println("Enter your Rows number");
        Scanner scanner = new Scanner(System.in);

        int Rows = scanner.nextInt();

        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
Expected Output::

Enter your Rows number
5
    1
   212
  32123
 4321234
543212345


* */