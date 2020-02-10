<<<<<<< HEAD:src/Loops_04/BiggestNumber.java
package Loops_04;
=======
package Lecture_06_Loops;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_06_Loops/BiggestNumber.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());

            if (num > max){

                max = num;
            }

        }
        System.out.println(max);
    }
}
