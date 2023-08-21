package SolidRhombusProblem;

import java.util.Scanner;

public class SolidRhombusEx1 {
    public static void main(String[] args) {
        System.out.println("Enter your Rows number");
        Scanner scanner = new Scanner(System.in);

        int Rows = scanner.nextInt();

//        Rows Number
        for (int i = 0; i <= Rows; i++) {
//            First Part:: Space
            for (int j = i; j <= Rows - 1; j++) {
                System.out.print(" ");
            }
//            Second Part:: Stars
            for (int j = 0; j <= Rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
Expected Output::

Enter your Rows number
8
        *********
       *********
      *********
     *********
    *********
   *********
  *********
 *********
*********

* */