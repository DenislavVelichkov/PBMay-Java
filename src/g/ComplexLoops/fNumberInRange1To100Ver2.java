package g.ComplexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fNumberInRange1To100Ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int n = Integer.parseInt(reader.readLine());

            if (n > 0 && n < 101){
                System.out.println("The number is: " + n);
                break;
            }
            System.out.println("Invalid number!");
        }
    }
}
