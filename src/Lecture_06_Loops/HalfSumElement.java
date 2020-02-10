<<<<<<< HEAD:src/Loops_04/HalfSumElement.java
package Loops_04;
=======
package Lecture_06_Loops;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_06_Loops/HalfSumElement.java

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



