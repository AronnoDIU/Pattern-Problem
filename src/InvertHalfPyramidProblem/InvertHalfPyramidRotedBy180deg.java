package InvertHalfPyramidProblem;

import java.util.Scanner;

public class InvertHalfPyramidRotedBy180deg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");
        int Rows = scanner.nextInt();

        for (int i = 0; i <= Rows; i++) {
            for (int j = 0; j <= Rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
* Expected Output::
Enter the value of Rows
5
      *
     **
    ***
   ****
  *****
 ******

* */
