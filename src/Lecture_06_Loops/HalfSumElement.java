package Lecture_06_Loops;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumAll = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num > max) {
                max = num;
            }

            sumAll += num;
        }
        sumAll -= max;

            if (max == sumAll) {
                System.out.println("Yes");
                System.out.println("Sum = " + max);

            } else {
                System.out.println("No");
                System.out.println("Diff= " + Math.abs(max - sumAll));
            }

        }

    }



