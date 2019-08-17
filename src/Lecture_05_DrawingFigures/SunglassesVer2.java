package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SunglassesVer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String firstLastRow = repeatString("*", n * 2) +
                repeatString(" ",n) + repeatString("*", n * 2);

        //FirstRow
        System.out.println(firstLastRow);

        //MiddlePart

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n * 2 -2; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            if (i == (n -1)/2 - 1){
                for (int j = 0; j < n; j++) {
                    System.out.print("|");
                }
            }else {
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
            }

            System.out.print("*");
            for (int j = 0; j < n * 2 -2; j++) {
                System.out.print("/");
            }
            System.out.println("*");

        }

        //LastRow
        System.out.println(firstLastRow);

    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
