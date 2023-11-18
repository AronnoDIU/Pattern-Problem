package ButterflyPatternProblem;

import java.util.Scanner;

public class ButterflyPatternExample1 {
    public static void main(String[] args) {
        System.out.println("Enter your Rows number");
        Scanner scanner = new Scanner(System.in);

        int Rows = scanner.nextInt();

//        Upper Half
        for (int i = 0; i <= Rows; i++) {
//            First Part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
//            Spaces
            for (int j = 0; j <= (2 * (Rows - i)); j++) {
                System.out.print(" ");
            }
//            Second Part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Lower Half
        for (int i = Rows; i >= 0; i--) {
//            First Part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
//            Spaces
            for (int j = 0; j <= (2 * (Rows - i)); j++) {
                System.out.print(" ");
            }
//            Second Part
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Expected OutPut:

Enter your Rows number
5

*           *
**         **
***       ***
****     ****
*****   *****
****** ******
****** ******
*****   *****
****     ****
***       ***
**         **
*           *


* */
