package f.DrawingFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sunglasses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

            System.out.print(repeatString("*", n * 2));
            System.out.print(repeatString(" ", n));
            System.out.println(repeatString("*", n * 2));

        for (int i = 0; i < n - 2; i++) {
               int isTrue = (n - 1) / 2 - 1;
            System.out.print("*");
            System.out.print(repeatString("/", 2 * n - 2));
            System.out.print("*");

            if (i == isTrue) {
                System.out.print(repeatString("|", n));
            } else {
                System.out.print(repeatString(" ", n));
            }

            System.out.print("*");
            System.out.print(repeatString("/", 2 * n - 2));
            System.out.println("*");
        }

        System.out.print(repeatString("*", n * 2));
        System.out.print(repeatString(" ", n));
        System.out.println(repeatString("*", n * 2));
    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
