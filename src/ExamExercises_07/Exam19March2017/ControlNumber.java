package ExamExercises_07.Exam19March2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int controlNum = Integer.parseInt(reader.readLine());

        int sum = 0;
        int combinationsCounter = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                sum += i * 2 + j * 3;
                combinationsCounter++;

            if (sum >= controlNum){
                System.out.printf("%d moves%n", combinationsCounter);
                System.out.printf("Score: %d >= %d", sum, controlNum);
                return;
            }

            }
        }
            System.out.printf("%d moves", combinationsCounter);
    }
}
