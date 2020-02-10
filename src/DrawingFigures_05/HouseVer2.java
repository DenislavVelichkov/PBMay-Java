package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HouseVer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        //FirstRow
        System.out.println(repeatString(" ",n+1) + "|");

        //LowerPart

        for (int i = 1; i <= n; i++) {
            System.out.println(repeatString(" ", n - i) + repeatString("*",i) +
                    " | " + repeatString("*",i));
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
