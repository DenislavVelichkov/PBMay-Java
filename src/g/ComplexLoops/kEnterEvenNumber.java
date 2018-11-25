package g.ComplexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kEnterEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            try {
                int n = Integer.parseInt(reader.readLine());

                if (n % 2 == 0) {
                    System.out.println("Even number is: " + n);
                    break;
                }
                System.out.println("The number is not even.");

            } catch (Exception ex) {

                System.out.println("Invalid number!");
            }
        }
    }
}
