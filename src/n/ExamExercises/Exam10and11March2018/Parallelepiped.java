package n.ExamExercises.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parallelepiped {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
//•	височина – 4 * n + 4 реда
//•	ширина – 3 * N + 1 колони
        int leftDots = 0;
        int rightDots = (3 * n + 1) - n;

        System.out.println("+" + repeatString("~", n - 2) + "+"
                + repeatString(".", (3 * n + 1) - n));
        for (int i = 0; i < 2 * n + 1; i++) {
            rightDots--;
            System.out.println("|" + repeatString(".", leftDots) + "\\" +
                                     repeatString("~", n - 2) + "\\" +
                                     repeatString(".", rightDots));
            leftDots++;
        }
            leftDots--;
            rightDots = leftDots;

        System.out.println("\\" + repeatString(".", leftDots) +
                                    "|" + repeatString("~", n - 2) + "|");
        leftDots = 1;
        for (int i = 0; i < n * 2; i++) {
            rightDots--;
            System.out.println(repeatString(".", leftDots) + "\\" + repeatString(".", rightDots) +
                                "|" + repeatString("~", n - 2) + "|" );
            leftDots++;
        }
        System.out.println(repeatString(".", leftDots) + "+" + repeatString("~", n - 2) +
                            "+");
    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
