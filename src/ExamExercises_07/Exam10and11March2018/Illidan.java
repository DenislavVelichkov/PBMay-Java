package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Illidan {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(scan.readLine());
        int sOne = Integer.parseInt(scan.readLine());
        int health = Integer.parseInt(scan.readLine());

        int battle = n * sOne;
        int diff = battle - health;

        if (battle >= health ){

            System.out.printf("Illidan has been slain! You defeated him with %d points.", diff);
        }else {
            System.out.printf("You are not prepared! You need %d more points.",Math.abs(diff));
        }
    }
}
