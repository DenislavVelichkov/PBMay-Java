package e.Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int previousSum = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int sum = a + b;

            if (i > 0 && sum != previousSum){
                int diff = Math.abs(sum - previousSum);
                if (diff > maxDiff){
                    maxDiff = diff;
                }
            }
            previousSum = sum;
        }
        if (maxDiff == 0){
            System.out.println("Yes , value=" + previousSum);
        }else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
