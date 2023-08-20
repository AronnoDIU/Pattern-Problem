package FloydTriangleProblem;

import java.util.Scanner;

public class FloydTriangleExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of Rows");

        int Rows = scanner.nextInt();
        int Number = 1;

        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(Number + " ");
                Number++;
            }
            System.out.println();
        }


//        Another Output
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("\n");

        for (int i = 1; i <= Rows; i++) {
            for (int j = i; j <= Rows; j++) {
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
2 3
4 5 6
7 8 9 10
11 12 13 14 15

_____________________________________

1 2 3 4 5
2 3 4 5
3 4 5
4 5
5

* */