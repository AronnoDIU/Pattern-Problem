package SwastikaSignPatternProblem;

import java.util.Scanner;

// Java program to Illustrate Swastika Sign Pattern Printing

public class SwastikaSignPatternEx1 {
    public static void main(String[] args) {
        // Creating an object of Scanner class to read input from user.
        Scanner scanner = new Scanner(System.in);

        // Reading number from user
        int number = scanner.nextInt();

        // Custom setting the rows to be 10 to understand the output.
        // Initializing rows to unity initially
        int rows = 1;

        // This condition holds true
        // Till rows are lesser than input number from user
        while (rows <= number) {

            if (rows == 1) {

                // Start work from here
                System.out.print("*");  // No-new line Printing

                // Printing Space
                for (int space = 1; space < number / 2; space++)
                    System.out.print(" ");  // No-new line Printing

                // Stars after Spaces
                for (int cst = (number / 2) + 1; cst <= number; cst++)

                    System.out.print("*");
                System.out.println();
            }

            else if (rows <= number / 2 && rows > 1) {
                // Then Print Stars
                System.out.print("*");

                // Printing Space
                for (int space = 1; space < number / 2; space++)

                    System.out.print(" ");
                System.out.print("*"); // Stars after Spaces and NewLine
                System.out.println();
            }

            else if (rows == (number / 2) + 1) {

                for (int cstt = 1; cstt <= number; cstt++)

                    System.out.print("*");
                System.out.println();
            }

            else if (rows <= number - 1 && rows > (number / 2) + 1) {

                /// Printing Space
                for (int csp = 1; csp <= number / 2; csp++)
                    System.out.print(" ");

                // Star work
                System.out.print("*");

                // Printing Space
                for (int cspp = 1 + (number / 2); cspp < number - 1;
                     cspp++)

                    System.out.print(" ");

                // Star work
                System.out.print("*");
                System.out.println();
            }
            else {

                for (int csttt = 1; csttt <= (number / 2) + 1;
                     csttt++)

                    System.out.print("*");

                for (int csppp = (number / 2) + 2;
                     csppp <= number - 1; csppp++)

                    System.out.print(" ");
                System.out.print("*");
            }
            rows++;
        }
    }
}

/*
Expected Output::

10
*    *****
*    *
*    *
*    *
*    *
**********
     *   *
     *   *
     *   *
******   *

* */