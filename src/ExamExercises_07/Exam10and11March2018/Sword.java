package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sword {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int width = 2 * n + 1;
        int diesCount = n - 1;
        int gapCount = 3;
        String letters = "";
//Zadachata e sgreshena, na 4 nqma razstoqnie mejdu bukvite..
        System.out.println(repeatString("#", diesCount) + "/^\\" +
                repeatString("#", diesCount));
        for (int i = 0; i < n / 2; i++) {
            diesCount--;
            System.out.println(repeatString("#", diesCount) + "." +
                                repeatString(" ",gapCount) +
                                "." + repeatString("#", diesCount));
            gapCount += 2;
        }
        for (int i = 0; i <= n + 3; i++) {
            if (i == 0){
                letters = "S";
            } else if (i == 1){
                letters = "O";
            } else if (i == 2){
                letters = "F";
            } else if (i == 3){
                letters = "T";
            } else if (i == n + 1){
                letters = "U";
            } else if (i == n + 2){
                letters = "N";
            } else if (i == n + 3){
                letters = "I";
            }else {
                letters = " ";
            }
            System.out.println(repeatString("#", diesCount) + "|" + repeatString(" ", n / 2) +
                    letters + repeatString(" ", n / 2) + "|" + repeatString("#", diesCount));
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
