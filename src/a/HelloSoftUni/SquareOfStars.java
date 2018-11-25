package a.HelloSoftUni;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            System.out.println();

            for (int col = 1; col <= n; col++) {

                if (row == 1 || row == n) {
                    System.out.print("*");
                }
                else {
                    if (col == 1 || col == n) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}