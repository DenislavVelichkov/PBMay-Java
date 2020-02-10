package ExamExercises_07.Exam23July2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char capitalLetter = reader.readLine().charAt(0);
        char smallLetter1 = reader.readLine().charAt(0);
        char smallLetter2 = reader.readLine().charAt(0);
        char smallLetter3 = reader.readLine().charAt(0);
        int num = Integer.parseInt(reader.readLine());
        int suggestionsCount = 0;

        for (char i = 'A'; i <= capitalLetter; i++) {
            for (char j = 'a'; j <= smallLetter1; j++) {
                for (int k = 'a'; k <= smallLetter2; k++) {
                    for (int l = 'a'; l <= smallLetter3; l++) {
                        for (int m = 0; m <= num; m++) {
                            suggestionsCount++;

                        }
                    }
                }
            }
        }
        System.out.println(suggestionsCount - 1);
    }
}
