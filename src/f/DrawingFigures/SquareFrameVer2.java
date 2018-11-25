package f.DrawingFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareFrameVer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");



        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.print(" +");
    }
}
