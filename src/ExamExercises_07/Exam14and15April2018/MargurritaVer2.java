package ExamExercises_07.Exam14and15April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MargurritaVer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int rows = 7 * n + 3;
        int cols = 8 * n + 2;

        int apostropheCount = 1;
        //FirstRow
        System.out.println(repeatString("'", apostropheCount) +"&$"
                + repeatString("'", cols - 3));
        apostropheCount++;

        //Straw
        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeatString("'", apostropheCount) + "\\" +
                    repeatString("'", cols - apostropheCount - 1));
            apostropheCount++;
        }

        //Sugar
        System.out.println(repeatString("^*", cols / 2 - 1) + "^'");

        //SomePart
        int leftApostrophe = 0;
        int rightApostrophe = 1;

        for (int i = 0; i < n - 1; i++) {
            System.out.print(repeatString("'", leftApostrophe));
            System.out.print("\\\\");
            System.out.print(repeatString(" ", n));
            System.out.print("\\");
            System.out.print(repeatString(" ",
                    cols - leftApostrophe - rightApostrophe - 5 - n));
            System.out.print("//");
            System.out.println(repeatString("'", rightApostrophe));

            rightApostrophe++;
            leftApostrophe++;
        }

        System.out.println(repeatString("'", leftApostrophe) + "\\" +
                repeatString("~", cols - leftApostrophe - rightApostrophe - 2) +
                "/" + repeatString("'", rightApostrophe));
        leftApostrophe++;
        rightApostrophe++;

        int symbol = cols - leftApostrophe - rightApostrophe - 2;
        for (int i = 0; i < 3 * n -1; i++) {
            System.out.print(repeatString("'", leftApostrophe));
            System.out.print("\\");

            if (i == n - 2 || i == 3 * n - 2){
                System.out.print(repeatString("_",symbol));
            } else if (i == n - 1){
                System.out.print(repeatString(".", symbol));
            } else {
                System.out.print(repeatString(" ", symbol));
            }

            System.out.print("/");
            System.out.println(repeatString("'", rightApostrophe));

            leftApostrophe++;
            rightApostrophe++;
            symbol -= 2;

        }

        //Handle
        for (int i = 0; i < 2 * n + 1; i++) {
            System.out.println(repeatString("'",leftApostrophe) + "|||" +
                    repeatString("'", rightApostrophe));
        }

        //BeforeLastRow
        System.out.println(repeatString("_", cols - 1) + "'");

        //LastRow
        System.out.println("'" + repeatString("-", cols - 3) + "''");

    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
