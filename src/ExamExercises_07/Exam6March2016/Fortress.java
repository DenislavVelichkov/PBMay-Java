package ExamExercises_07.Exam6March2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fortress {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.print("/");
        System.out.print(repeatString("^", n / 2));
        System.out.print("\\");

        int slashesCOunt = n * 2 - ((n / 2 + 2) * 2);

        System.out.print(repeatString("_", slashesCOunt));
        System.out.print("/");
        System.out.print(repeatString("^", n / 2));
        System.out.println("\\");

        for (int i = 0; i < n - 3; i++) { // n - 3 ( bez 1 - viq i poslednite 2 reda)
            System.out.print("|");
            System.out.print(repeatString(" ", 2 * n - 2));
            System.out.println("|");
        }
        System.out.print("|");
        System.out.print(repeatString(" ", n / 2 + 1));
        System.out.print(repeatString("_", slashesCOunt));
        System.out.print(repeatString(" ",n / 2 + 1));
        System.out.println("|");

        System.out.print("\\");
        System.out.print(repeatString("_", n / 2));
        System.out.print("/");
        System.out.print(repeatString(" ", slashesCOunt));
        System.out.print("\\");
        System.out.print(repeatString("_", n / 2));
        System.out.print("/");

    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}