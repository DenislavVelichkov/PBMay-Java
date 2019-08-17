package r.ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrepArrow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int slashesCount = (n + 5 - 1) / 2;

        System.out.println(repeatString("_", slashesCount) +
                            "^" + repeatString("_", slashesCount));
        slashesCount--;

        System.out.println(repeatString("_", slashesCount) + "/|\\" +
                            repeatString("_", slashesCount));
        slashesCount--;

        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatString("_", slashesCount) + "/" + repeatString(".", i) +
                                "|||" + repeatString(".", i) + "\\" + repeatString("_", slashesCount));
            slashesCount--;

        }
        slashesCount = (n + 5 - 9) / 2;

        System.out.print(repeatString("_", slashesCount));
        System.out.print("/..|||..\\");
        System.out.println(repeatString("_", slashesCount));

        slashesCount++;

        System.out.print(repeatString("_", slashesCount));
        System.out.print("/.|||.\\");
        System.out.println(repeatString("_", slashesCount));

            slashesCount += 2;

        for (int i = 0; i < n; i++) {

            System.out.print(repeatString("_", slashesCount));
            System.out.print("|||");
            System.out.println(repeatString("_", slashesCount));
        }
        System.out.println(repeatString("_", slashesCount) + "~~~" +
                           repeatString("_", slashesCount));

        for (int i = 0; i < n / 2; i++) {
            slashesCount--;
            System.out.print(repeatString("_", slashesCount));
            System.out.print("//");
            System.out.print(repeatString(".", i));
            System.out.print("!");
            System.out.print(repeatString(".", i));
            System.out.print("\\\\");
            System.out.println(repeatString("_", slashesCount));
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
