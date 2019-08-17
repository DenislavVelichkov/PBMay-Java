package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitcoinCodeGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int maxCountCodes = Integer.parseInt(reader.readLine());

        int counter = 0;
        char i = 32;
        char j = 57;

            for (int k = 1; k <= a; k++) {
                for (int l = 1; l <= b; l++) {
                    i++;
                    j++;

                    if (i > 47) i = 33;
                    if (j > 64) j = 58;

                    counter++;

                    System.out.printf("%s%s%d%d%s%s|", i, j, k, l, j, i);

                    if (counter == maxCountCodes)return;

            }
        }
    }
}

