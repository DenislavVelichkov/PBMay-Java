package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleOfDollars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
