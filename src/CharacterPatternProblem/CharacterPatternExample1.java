package CharacterPatternProblem;

import java.util.Scanner;

public class CharacterPatternExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");

        int Rows = scanner.nextInt();
        char Ch = 'A';

        for (int line = 0; line <= Rows; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(Ch + " ");
                Ch++;
            }
            System.out.println();
        }
    }
}

/*
Expected Output::
Enter the value of Rows
5

A
B C
D E F
G H I J
K L M N O

* */
