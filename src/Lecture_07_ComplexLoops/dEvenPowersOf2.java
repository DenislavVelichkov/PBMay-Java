package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dEvenPowersOf2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (long i = 1; i <= Math.pow(2, n); i*=4) { // Math.pow(2, n) povdiga osnovata "2" na stepen "n"
            System.out.println(i);
                                // promenlivata definira, kato int shte prevyrti v cikyla i koda se chupi
                                // zaradi tova definirame n, kato long
        }
    }
}
