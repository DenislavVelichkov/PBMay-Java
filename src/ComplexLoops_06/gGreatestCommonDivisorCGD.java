package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gGreatestCommonDivisorCGD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        while (b != 0){ //Nai golqm obsht delitel, chislo, koeto ednovremenno se deli na a i b
            int oldB = b;
            b = a % b;
            a = oldB;
            System.out.println(a);
        }
    }
}
