package ExamExercises_07.Exam26March2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Butterfly {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int wight = 2 * n - 1;

        for (int i = 1; i <= n - 2; i++) {

            if (i % 2 == 0) {
                System.out.print(repeatString("-", (wight / 2) - 1 ));
                System.out.print("\\ ");
                System.out.print("/");
                System.out.println(repeatString("-", (wight / 2) - 1 ));
            }else {
                System.out.print(repeatString("*", (wight / 2) - 1 ));
                System.out.print("\\ ");
                System.out.print("/");
                System.out.println(repeatString("*", (wight / 2) - 1 ));
            }

        }
        System.out.print(repeatString(" ", wight / 2));
        System.out.print("@");
        System.out.println(repeatString(" ", wight / 2));

        for (int j = 1; j <= n - 2; j++) {

            if (j % 2 == 0) {
                System.out.print(repeatString("-", (wight / 2) - 1));
                System.out.print("/ ");
                System.out.print("\\");
                System.out.println(repeatString("-", (wight / 2) - 1));
            } else {
                System.out.print(repeatString("*", (wight / 2) - 1));
                System.out.print("/ ");
                System.out.print("\\");
                System.out.println(repeatString("*", (wight / 2) - 1));
            }
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
