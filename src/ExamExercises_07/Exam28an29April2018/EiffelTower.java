package ExamExercises_07.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EiffelTower {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int leftRight = n - 3;
        int mid = 8;

        for (int i = 0; i < n; i++) {
            System.out.print(repeatString("-", n + 2));
            System.out.print("**");
            System.out.println(repeatString("-", n + 2));
        }
        for (int i = 0; i < n - 3; i++) {
            System.out.print(repeatString("-", n + 1));
            System.out.print("****");
            System.out.println(repeatString("-", n + 1));
        }
        System.out.print(repeatString("-", n));
        System.out.print("******");
        System.out.println(repeatString("-", n));

        for (int i = 0; i < n - 4; i++) {
            System.out.print(repeatString("-", n));
            System.out.print("**--**");
            System.out.println(repeatString("-", n));
        }
        for (int i = 0; i < n - 3; i++) {
            System.out.print(repeatString("-", n - 1));
            System.out.print("**----**");
            System.out.println(repeatString("-", n - 1));
        }

        System.out.print(repeatString("-", n - 2));
        System.out.print("**********");
        System.out.println(repeatString("-", n - 2));

// Draw the bottom part

        for (int i = 1; i <= n - 3; i++) {
            System.out.print(repeatString("-", leftRight));

            System.out.print("**");
            System.out.print(repeatString("-", mid));
            System.out.print("**");

            System.out.println(repeatString("-", leftRight));

            leftRight--;
            mid += 2;
        }
        System.out.print("***");
        System.out.print(repeatString("-", n * 2));
        System.out.println("***");

    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
