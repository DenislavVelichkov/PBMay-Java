package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lFibomacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int f0 = 1;
        int f1 = 1;

        for (int i = 1; i <= n - 1; i++) {
            if (n < 2){

                System.out.println("1");
                break;

            }   else {
               int fn = f0 + f1;
                f0 = f1;
                f1 = fn;

            }
        }
        System.out.println(f1);

        }

}
