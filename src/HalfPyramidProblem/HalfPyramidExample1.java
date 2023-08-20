package HalfPyramidProblem;

import java.util.Scanner;

public class HalfPyramidExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");
        int Rows = scanner.nextInt();


        for (int i = 0; i < Rows; i++) {
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

* */
