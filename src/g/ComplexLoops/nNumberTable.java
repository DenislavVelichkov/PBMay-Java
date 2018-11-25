package g.ComplexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nNumberTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int numToBe = row + col + 1;

                if (numToBe > n){
                    numToBe = 2 * n - numToBe;
                }
                System.out.print(numToBe + " ");
                numToBe = numToBe;
            }
            System.out.println();
        }
    }
}
