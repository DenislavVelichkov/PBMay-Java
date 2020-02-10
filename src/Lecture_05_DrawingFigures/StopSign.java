package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StopSign {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        System.out.print(repeatString(".", n + 1));
        System.out.print(repeatString("_", 2 * n + 1));
        System.out.println(repeatString(".", n + 1));

        int midLinesCount = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(".", n - i));
            System.out.print("//");
            System.out.print(repeatString("_", midLinesCount));
            midLinesCount += 2;
            System.out.print("\\\\");  // oznachava 2 cherti
            System.out.println(repeatString(".", n - i));
        }
        // print Stop
        System.out.print("//");
        System.out.print(repeatString("_", n * 2 - 3));
        System.out.print("STOP!");
        System.out.print(repeatString("_", n * 2 - 3));
        System.out.println("\\\\");

        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(".", i));
            System.out.print("\\\\");
            System.out.print(repeatString("_", midLinesCount));
            midLinesCount -= 2;
            System.out.print("//");
            System.out.println(repeatString(".", i));
        }
    }

    private static String repeatString(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }
}