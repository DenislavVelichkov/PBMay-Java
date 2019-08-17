package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareFrame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String symbol;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1){
                symbol = "+";

            }else {
                symbol = "|";
            }
            System.out.print(symbol + " ");

            for (int j = 0; j < n - 2; j++) {
                System.out.print("- ");
            }
            System.out.println(symbol);
        }
    }
}
