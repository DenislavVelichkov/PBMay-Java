<<<<<<< HEAD:src/Loops_04/LeftAndRightSum.java
package Loops_04;
=======
package Lecture_06_Loops;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_06_Loops/LeftAndRightSum.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftAndRightSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int sumLeft = 0;
        int sumRight = 0;


        for (int i = 1; i <= n; i++) {
            sumLeft += Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < n; i++) {
            sumRight += Integer.parseInt(reader.readLine());

        }

        if (sumLeft == sumRight) {
            System.out.println("Yes, sum = " + sumLeft); // bez znachenie koq suma

        } else {

            System.out.println("No, diff = " + Math.abs(sumLeft - sumRight));
        }
    }

}

