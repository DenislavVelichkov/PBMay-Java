package ExamExercises_07.Exam14and15April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PIN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int dashCount = 0;

//Draw First Row
        System.out.println("/`" + repeatString("P", n * 2) + repeatString(" ", n) +
                        "/`I" + repeatString(" ", n) + "/`N" + repeatString(" ", n * 2 + 1) +
                        "N");
//Draw Second Row
        System.out.println("| P" + repeatString(" ", n * 2 - 2) + "P" + repeatString(" ", n) +
                "| I" + repeatString(" ", n) + "| NN" + repeatString(" ", n * 2) +
                "N");
//Draw rows until middle
        if (n > 2){
            for (int i = 1; i < n - 1; i++) {
                dashCount++;
                System.out.println("| P" + repeatString(" ", n * 2 - 2) + "P" +
                        repeatString(" ", n) + "| I" + repeatString(" ", n) +
                        "| N" + repeatString(" ", i)
                        + "N" + repeatString(" ", n * 2 - dashCount) +
                        "N");
            }
            System.out.println("| P" + repeatString("P", n * 2 - 1) +
                    repeatString(" ", n) + "| I" + repeatString(" ", n) +
                    "| N" + repeatString(" ", n - 1)
                    + "N" + repeatString(" ", n + 1) + "N");

            }else{
//Draw midle row
                System.out.println("| P" + repeatString("P", n * 2 - 1) +
                        repeatString(" ", n) + "| I" + repeatString(" ", n) +
                        "| N" + repeatString(" ", n - 1)
                        + "N" + repeatString(" ", n + 1) + "N");
            }
// Draw mid/bottom rows
            dashCount = 0;

            if ( n >= 3) {
                for (int i = 0; i < n; i++) {
                    dashCount++;
                    System.out.println("| PP" + repeatString(" ", n * 2 + n - 2) +
                            "| I" + repeatString(" ", n) +
                            "| N" + repeatString(" ", n - 1 + dashCount) +
                            "N" + repeatString(" ", n + 1 - dashCount) +
                            "N");
                }
            }else {
                for (int i = 0; i < n; i++) {
                    dashCount++;
                    System.out.println("| P" + repeatString(" ", n * 2 + 1) +
                            "| I" + repeatString(" ", n) +
                            "| N" + repeatString(" ", n - 1 + dashCount)
                            + "N" + repeatString(" ", n + 1 - dashCount) +
                            "N");
                }
            }
//Draw Bottom Row
            if ( n  >= 3) {
                System.out.println("\\_" + "PP" + repeatString(" ", n * 2 + n - 2) +
                        "\\_I" + repeatString(" ", n) + "\\_N" + repeatString(" ", n * 2) +
                        "NN");
            }else {
                System.out.println("\\_" + "P" + repeatString(" ", n * 2 + 1) +
                        "\\_I" + repeatString(" ", n) + "\\_N" +
                        repeatString(" ", n * 2) +
                        "NN");
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
