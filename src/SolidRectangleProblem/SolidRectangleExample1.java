package SolidRectangleProblem;

import java.util.Scanner;

public class SolidRectangleExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");
        int Rows = scanner.nextInt();

        System.out.println("Enter the value of Columns");
        int Columns = scanner.nextInt();

        for (int i = 0; i < Rows; i++) {
            for (int j = 1; j < Columns; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}


/*Esteemed Output::
Enter the value of Rows
5
Enter the value of Columns
10
**********
**********
**********
**********
**********

*/