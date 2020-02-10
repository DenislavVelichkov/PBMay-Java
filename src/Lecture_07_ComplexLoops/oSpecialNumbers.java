package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oSpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9 ; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0){
                            System.out.print("" + i + j + k + l + " ");
                        }
                    }
                }
            }
        }
    }
}
