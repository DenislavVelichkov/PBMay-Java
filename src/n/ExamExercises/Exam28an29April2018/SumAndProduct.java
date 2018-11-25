package n.ExamExercises.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumAndProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());


        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {

                        int numSum = a + b + c + d;
                        int numMultiplication = a * b * c * d;

                        if (numSum == numMultiplication && n % 10 == 5){
                            System.out.println("" + a + b + c + d);
                                return;

                        }
                        if (numMultiplication / numSum == 3 && n % 3 == 0){
                            System.out.println("" + d + c + b + a);
                                return;
                        }
                    }
                }
            }
        }
        System.out.println("Nothing found");
    }
}
