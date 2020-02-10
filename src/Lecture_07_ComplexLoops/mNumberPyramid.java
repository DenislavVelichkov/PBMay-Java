package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mNumberPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());

        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col > 1) System.out.print(" ");
                System.out.print(num);
                num++;
                if (num > n) {
                    break;
                }
            }
            System.out.println();
            if (num > n) {
                break;

            }
        }
    }
}
