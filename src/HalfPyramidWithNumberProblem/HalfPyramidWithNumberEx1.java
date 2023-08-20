package HalfPyramidWithNumberProblem;

import java.util.Scanner;

public class HalfPyramidWithNumberEx1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of Rows");
        Scanner scanner = new Scanner(System.in);

        int Rows = scanner.nextInt();

        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
* Expected Output::
Enter the value of Rows
5

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

* */
