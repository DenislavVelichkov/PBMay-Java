package ExamExercises_07.Exam17September2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeBrothers {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(scan.readLine());
        double b = Double.parseDouble(scan.readLine());
        double c = Double.parseDouble(scan.readLine());
        double d = Double.parseDouble(scan.readLine());

        double totTime = 1 / (1/a + 1/b + 1/c);
        double clnTimeWithRest = totTime * 1.15;
        double timeLeft = d - clnTimeWithRest;

        System.out.printf("Cleaning time: %.2f%n", clnTimeWithRest);

        if (timeLeft > 0){
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", (Math.floor(timeLeft)));

        }else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.abs(Math.floor(timeLeft)));
        }

    }
}
