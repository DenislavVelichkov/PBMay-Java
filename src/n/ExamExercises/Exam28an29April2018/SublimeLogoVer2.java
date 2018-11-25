package n.ExamExercises.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SublimeLogoVer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        int spaces = 0;
        int stars = 0;
        spaces =  2 * n - stars;

        for (int i = 0; i < n; i++) {
            stars+=2;
            spaces =  2 * n - stars;
            System.out.println(String.format("%s%s",
                    repeatString(" ", spaces),
                    repeatString("*", stars)));
        }

        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                stars -=2;
            } else {
                stars +=2;
            }
            spaces =  2 * n - stars;
            System.out.println(String.format("%s%s",
                    repeatString("*", stars),
                    repeatString(" ", spaces)));
        }

        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                stars -=2;
            } else {
                stars +=2;
            }
            spaces =  2 * n - stars;
            System.out.println(String.format("%s%s",
                    repeatString(" ", spaces),
                    repeatString("*", stars)));
        }

        for (int i = 0; i < n - 1; i++) {
            stars -=2;
            spaces =  2 * n - stars;

            System.out.println(String.format("%s%s",
                    repeatString("*", stars),
                    repeatString(" ", spaces)));
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
