package f.DrawingFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareOfStars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int row = 0; row < n; row++) {
            System.out.print("*");
            for (int colum = 0; colum < n - 1; colum++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
