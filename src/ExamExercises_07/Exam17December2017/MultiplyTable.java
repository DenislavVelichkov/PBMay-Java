package ExamExercises_07.Exam17December2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        int firstDigit = num % 10; //get first digit, second digit, third digit
        int secDigit = num / 10 % 10;
        int thirdDigit = num / 100;

        for (int i = 1; i <= firstDigit; i++) {
            for (int j = 1; j <= secDigit; j++) {
                for (int k = 1; k <= thirdDigit; k++) {

                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, (i * j * k));
                }
            }
        }
    }
}
