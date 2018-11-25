package s.Exam7and8July2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NightLamp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
//Височината на
//фигурата е 2 * n + 8
//Широчината на фигурата е 4 * n + 11

        int width = 4 * n + 11;
        int dots = n + 4;
        int innerDots = n * 2 + 1;

        System.out.println(repeatString(".", dots) + repeatString("_", n) +
                "/|\\" + repeatString("_", n) +
                repeatString(".", dots));

        System.out.println(repeatString(".", dots) + "/" + repeatString("-", n * 2 + 1) + "\\" +
                repeatString(".", dots));

        for (int i = 0; i < 3; i++) {
            dots--;
            innerDots += 2;
            System.out.println(repeatString(".", dots) + "/" + repeatString(".", innerDots) +
                    "\\" + repeatString(".", dots));
        }
        dots--;
        innerDots += 2;
        System.out.println(repeatString(".", dots) + "/" + repeatString("_", innerDots) +
                "\\" + repeatString(".", dots));

        for (int i = 0; i < n - 2; i++) {
            dots--;
            innerDots += 2;
            System.out.println(repeatString(".", dots) + "/" + repeatString(".", innerDots) +
                    "\\" + repeatString(".", dots));
        }
        for (int i = 0; i < 2; i++) {
            dots--;
            innerDots += 2;
            System.out.println(repeatString(".", dots) + "/" + repeatString("_", innerDots) +
                    "\\" + repeatString(".", dots));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(repeatString(".", width - width / 2 - 2) + "|$|" + repeatString(".", width - width / 2 - 2));
        }
        System.out.println("...." + repeatString("_", width - width / 2 - 2 - 4) + "|$|" + repeatString("_", width - width / 2 - 2 - 4) + "....");
        System.out.println(".../" + repeatString("_", width - width / 2 - 2 - 4) + "___" + repeatString("_", width - width / 2 - 2 - 4) + "\\...");
    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
