package HollowRectangleProblem;

import java.util.Scanner;

public class HollowRectangleEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");
        int Rows = scanner.nextInt();

        System.out.println("Enter the value of Columns");
        int Columns = scanner.nextInt();

//        int n = 4, m = 5;

        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Columns; j++) {
                if ((i == 1) || (j == 1) || (i == Rows) || (j == Columns)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/*
* Expected Output::

Enter the value of Rows
4
Enter the value of Columns
5
*****
*   *
*   *
*****

* */