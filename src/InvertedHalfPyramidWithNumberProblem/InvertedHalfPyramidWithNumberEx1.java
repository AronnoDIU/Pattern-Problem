package InvertedHalfPyramidWithNumberProblem;

import java.util.Scanner;

public class InvertedHalfPyramidWithNumberEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");

        int Rows = scanner.nextInt();

        for (int i = Rows; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


//        OR

        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Rows - i + 1; j++) {
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

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

* */