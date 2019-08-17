package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cPowersOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int num = 1;

        for (int i = 0; i <= n; i+=2) {

            System.out.println(num);
            num *= 2 * 2;
        }

    }
}
