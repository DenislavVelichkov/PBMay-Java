package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dEvenPowersOf2Ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int num = 1;
        for (int i = 1; i <= n; i+=2) { // Math.pow(2, n) povdiga osnovata "2" na stepen "n"
            System.out.println(num);
            num *= 2 * 2;
        }
    }
}
