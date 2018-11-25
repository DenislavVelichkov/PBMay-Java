package n.ExamExercises.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankNumberGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int element1 = Integer.parseInt(reader.readLine());
        char element2 = reader.readLine().charAt(0); // read char variable from console
        char element3 = reader.readLine().charAt(0);// Number Generator
        char element4 = reader.readLine().charAt(0);
        int element5 = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        int isTrueCounter = 0;

            for (int j = element1; j <= 99; j++) {

                for (char k = element2; k <= 'Z'; k++) {

                    for (char l = element3; l <= 'z'; l++) {

                        for (char m = element4; m <= 'Z'; m++) {

                            for (int o = element5; o >= 10; o--) {

                                if (j % 10 == 2 && o % 10 == 5) {
                                    isTrueCounter++;

                                    if (isTrueCounter == n) {
                                        System.out.println("" + j + k + l + m + o);
                                        return;

                                    }
                            }
                        }
                    }
                }
            }
        }
    }
}



