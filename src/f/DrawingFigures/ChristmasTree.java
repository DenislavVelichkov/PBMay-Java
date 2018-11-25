package f.DrawingFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasTree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i <= n; i++) {
            String spaces = repeatString(" ", n - i);
            String stars = repeatString("*", i);
            System.out.print(spaces);
            System.out.print(stars);
            System.out.print(" | ");
            System.out.print(stars);
            System.out.println(spaces);
        }
    }

        private static String repeatString(String text, int count){
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < count; i++) {
                result.append(text);
            }
            return result.toString();  //Izliza ot metoda i vryshta resultata;
        }
}
