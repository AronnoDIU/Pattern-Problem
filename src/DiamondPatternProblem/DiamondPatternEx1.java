package DiamondPatternProblem;

import java.util.Scanner;

public class DiamondPatternEx1 {
    public static void main(String[] args) {
        System.out.println("Enter your Rows number");
        Scanner scanner = new Scanner(System.in);

        int Rows = scanner.nextInt();

//        Upper Half Part

        for (int i = 0; i <= Rows; i++) {
            for (int j = 0; j < Rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Lower Half Part

        for (int i = Rows; i >= 0; i--) {
            for (int j = 0; j < Rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Another Way::

        //        Upper Half Part

        for (int i = 0; i <= Rows; i++) {
            for (int j = 0; j < Rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Lower Half Part

        for (int i = Rows; i >= 0; i--) {
            for (int j = 0; j < Rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

Expected Output::

Enter your Rows number
4
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

* */