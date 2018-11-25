package f.DrawingFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaimondVer3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int starsCount = 0;
        int rows = 0;

        if (n % 2 == 0){
            starsCount = 2;
            rows = n - 1;
        } else {
            starsCount = 1;
            rows = n;
        }

        int dashesCount = (n - starsCount) / 2;

        String firstLastRow = repeatString("-", dashesCount) +
                repeatString("*", starsCount) +
                repeatString("-", dashesCount);

        //FirstRow
        System.out.println(firstLastRow);
        dashesCount--;

        //MiddlePart
        int middleDashes = n - (2 * dashesCount) - 2;

        for (int i = 0; i < (rows - 1)/2; i++) {
            System.out.print(repeatString("-", dashesCount));
            System.out.print("*");
            System.out.print(repeatString("-", middleDashes));
            System.out.print("*");
            System.out.println(repeatString("-", dashesCount));

            dashesCount--;
            middleDashes += 2;
        }

        //LowerPart
        dashesCount += 2;
        middleDashes -= 4;

        for (int i = 0; i < (rows - 1) / 2 - 1; i++) {
            System.out.print(repeatString("-", dashesCount));
            System.out.print("*");
            System.out.print(repeatString("-", middleDashes));
            System.out.print("*");
            System.out.println(repeatString("-", dashesCount));

            dashesCount++;
            middleDashes -= 2;
        }

        if (n > 2){
            System.out.println(firstLastRow);
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
