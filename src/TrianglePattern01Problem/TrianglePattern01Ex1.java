package TrianglePattern01Problem;

import java.util.Scanner;

public class TrianglePattern01Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");

        int Rows = scanner.nextInt();

        for (int i = 0; i <= Rows; i++) {
            for (int j = 0; j < i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else System.out.print("0" + " ");
            }
            System.out.println();
        }
    }
}

/*
Expected Output::
Enter the value of Rows
5

0
1 0
0 1 0
1 0 1 0
0 1 0 1 0

* */
