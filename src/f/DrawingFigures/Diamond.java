package f.DrawingFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

if (n == 1){
    System.out.println("*");
}else {

    int leftRight = (n - 1) / 2;
    for (int i = 1; i <= (n - 1) / 2; i++) {
// Draw the top part
        System.out.print(repeatString("-", leftRight));
        System.out.print("*");

        int mid = n - 2 * leftRight - 2;
        if (mid >= 0) {
            System.out.print(repeatString("-", mid));
            System.out.print("*");
        }
        System.out.println(repeatString("-", leftRight));
        leftRight--;
    }
// Draw the mid part
    if (leftRight == 0) {
        System.out.print("*");
        System.out.print(repeatString("-", n - 2));
        System.out.println("*");
        leftRight = 1;
    }

// Draw the bottom part
    for (int i = 1; i <= (n - 1) / 2; i++) {
        System.out.print(repeatString("-", leftRight));
        System.out.print("*");

        int mid = n - 2 * leftRight - 2;
        if (mid >= 0) {
            System.out.print(repeatString("-", mid));
            System.out.print("*");
        }
        System.out.println(repeatString("-", leftRight));
        leftRight++;
    }
}

    }

    private static String repeatString(String text, int count){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
