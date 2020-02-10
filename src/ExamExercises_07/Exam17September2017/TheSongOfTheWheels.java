package ExamExercises_07.Exam17September2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheSongOfTheWheels {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());

        int counter = 0;
        boolean flag = false;
        String pass = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i * j + k * l == m) {
                            if (i < j && k > l) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                counter++;
                                if (counter == 4) {
                                    flag = true;
                                    pass = "" + i + j + k + l;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (flag) {
            System.out.print("Password: " + pass);
        } else {
            System.out.println("No!");
        }
    }
}
