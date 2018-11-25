package e.Loops;

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
