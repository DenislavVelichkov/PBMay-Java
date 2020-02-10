package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TenTimesTenRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int row = 0; row < 10; row++) {
            for (int colum = 0; colum < 10; colum++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
