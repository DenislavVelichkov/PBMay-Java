package ExamExercises_07.Exam17September2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sheriff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int width = n * 3;
        int height = 2 * n + 8;
        int exCounter = n;
        int dotCounter = n / 2;

// ширина 3 * n колони и 2 * n + 8 редове
        System.out.println(repeatString(".", n / 2 + n) + "x" +
                            repeatString(".", n / 2 + n));
        System.out.println(repeatString(".", n / 2 + n - 1) + "/" +
                "x" + "\\" + repeatString(".", n / 2 + n - 1));
        System.out.println(repeatString(".", n / 2 + n - 1) + "x" +
                "|" + "x" + repeatString(".", n / 2 + n - 1));

        for (int i = 0; i < n / 2; i++) {

            System.out.println(repeatString(".", dotCounter) + repeatString("x", exCounter) + "|" +
                                repeatString("x", exCounter) + repeatString(".", dotCounter));
            dotCounter--;
            exCounter++;
        }
            System.out.println(repeatString("x", width / 2) + "|" + repeatString("x", width / 2));

            dotCounter += 1;
            exCounter -= 1;

        for (int i = 0; i < n / 2; i++) {

            System.out.println(repeatString(".", dotCounter) + repeatString("x", exCounter) + "|" +
                    repeatString("x", exCounter) + repeatString(".", dotCounter));

            dotCounter++;
            exCounter--;

        }

        System.out.println(repeatString(".", n / 2 + n - 1) + "/" +
                "x" + "\\" + repeatString(".", n / 2 + n - 1));

        System.out.println(repeatString(".", n / 2 + n - 1) + "\\" +
                "x" + "/" + repeatString(".", n / 2 + n - 1));

        dotCounter = n / 2;
        exCounter = n;

        for (int i = 0; i < n / 2; i++) {

            System.out.println(repeatString(".", dotCounter) + repeatString("x", exCounter) + "|" +
                    repeatString("x", exCounter) + repeatString(".", dotCounter));
            dotCounter--;
            exCounter++;
        }
        System.out.println(repeatString("x", width / 2) + "|" + repeatString("x", width / 2));

        dotCounter += 1;
        exCounter -= 1;

        for (int i = 0; i < n / 2; i++) {

            System.out.println(repeatString(".", dotCounter) + repeatString("x", exCounter) + "|" +
                    repeatString("x", exCounter) + repeatString(".", dotCounter));

            dotCounter++;
            exCounter--;
        }
        System.out.println(repeatString(".", n / 2 + n - 1) + "x" +
                "|" + "x" + repeatString(".", n / 2 + n - 1));

        System.out.println(repeatString(".", n / 2 + n - 1) + "\\" +
                "x" + "/" + repeatString(".", n / 2 + n - 1));

        System.out.println(repeatString(".", n / 2 + n) + "x" +
                repeatString(".", n / 2 + n));
    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
