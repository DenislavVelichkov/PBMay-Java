<<<<<<< HEAD:src/Loops_04/OddEvenSum.java
package Loops_04;
=======
package Lecture_06_Loops;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_06_Loops/OddEvenSum.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(reader.readLine());

            if (i % 2 == 0) {
                evenSum += num;

            } else {

                oddSum += num;
            }
        }

            if (oddSum == evenSum){

                System.out.println("Yes");
                System.out.println("Sum = " + evenSum);

            }else {
                System.out.println("No\nDiff = " + Math.abs(oddSum - evenSum));


        }
    }
}
