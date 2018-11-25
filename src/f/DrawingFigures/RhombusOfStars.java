package f.DrawingFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusOfStars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int row = 1; row <= n; row++) {   // Print top part
            for (int i = 0; i < n - row; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Print bottom part
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
