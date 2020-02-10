package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialCombinationsVer2WithMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        for (int i = 2; i <= a; i++) {
            for (int j = 2; j <= b; j++) {
                for (int k = 2; k <= c; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && isPrime(j)) {
                        System.out.printf("%d %d %d%n", i, j ,k);
                    }
                }
            }
        }
    }

    static boolean isPrime(int num) {  //Definirane na method (metod)


        for (int l = 2; l <= Math.sqrt(num); l++) {
            if (num % l == 0) {
                return false;
            }
        }

        return true;
    }
}
