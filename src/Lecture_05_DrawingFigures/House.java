package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class House {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

            int stars = 1;
            if (n % 2 == 0) stars++;

        for (int i = 0; i < (n + 1) / 2; i++) {
            int padding = (n - stars) / 2;

            System.out.print(repeatString("-", padding));
            System.out.print(repeatString("*", stars));
            System.out.println(repeatString("-", padding));
            stars += 2;
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.print("|");
            System.out.print(repeatString("*", n - 2));
            System.out.println("|");
        }
    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
