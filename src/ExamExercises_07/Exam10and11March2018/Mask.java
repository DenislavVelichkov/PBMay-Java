package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int width = (2 * n) + 2;
        int specialValueOuter = n - 2;
        int specialValueInner = 0;

        for (int i = 1; i <= n / 2 * 2; i++) {


            System.out.println(repeatString(" ", specialValueOuter) + "/" +
                                repeatString(" ", specialValueInner) + "|" + "  " + "|" +
                                repeatString(" ", specialValueInner) + "\\" +
                                repeatString(" ", specialValueOuter));
            specialValueOuter--;
            specialValueInner++;
        }
        System.out.println(repeatString("-", width));

        System.out.println("|" + repeatString(" ", n / 2 - 1) + "_" +repeatString(" ", n + 1) +
                            "_" + repeatString(" ", n / 2 - 1) + "|");

        System.out.println("|" + repeatString(" ", n / 2 - 1) + "@" +repeatString(" ", n + 1) +
                "@" + repeatString(" ", n / 2 - 1) + "|");

        for (int i = 0; i < n / 2; i++) {
            System.out.println("|" + repeatString(" ", n * 2) + "|");
        }

        System.out.println("|" + repeatString(" ", n - 1) + "OO" + repeatString(" ", n - 1) + "|");
        System.out.println("|" + repeatString(" ", n - 2) + "/  \\" + repeatString(" ", n - 2) + "|");
        System.out.println("|" + repeatString(" ", n - 2) + "||||" + repeatString(" ", n - 2) + "|");

        specialValueInner = n * 2;
        specialValueOuter = 1;

        for (int i = 0; i < n + 1; i++) {
            System.out.println(repeatString("\\", specialValueOuter) +
                                repeatString("`", specialValueInner) +
                                repeatString("/", specialValueOuter));

            specialValueInner -= 2;
            specialValueOuter++;
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
