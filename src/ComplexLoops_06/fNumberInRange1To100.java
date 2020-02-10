package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fNumberInRange1To100 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        while (n < 1 || n > 100){
            System.out.println("Invalid number!");
            n = Integer.parseInt(reader.readLine());
        }
        System.out.println("The number is: " + n);
    }
}
