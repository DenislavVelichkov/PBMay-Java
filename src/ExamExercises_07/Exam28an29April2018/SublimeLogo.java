package ExamExercises_07.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SublimeLogo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int starsCount = 0;

        for (int i = n * 2; i > 0; i -= 2) {
            starsCount++;
            System.out.print(repeatString(" ", i - 2));
            System.out.println(repeatString("**", starsCount));
        }

        System.out.println(repeatString("**", starsCount - 1));
        System.out.println(repeatString("**", starsCount - 2));
        System.out.println(repeatString("**", starsCount - 1));
        System.out.println(repeatString("**", starsCount));
        System.out.print("  ");
        System.out.println(repeatString("**", starsCount - 1));
        System.out.print("    ");
        System.out.println(repeatString("**", starsCount - 2));
        System.out.print("  ");
        System.out.println(repeatString("**", starsCount - 1));

        for (int i = n * 2; i > 0; i -= 2) {
            System.out.println(repeatString("*", i));
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
