package n.ExamExercises.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Travel {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double xTrack = Double.parseDouble(scan.readLine());
        double vTruck = Double.parseDouble(scan.readLine());
        double y = Double.parseDouble(scan.readLine());

        double carV = y * 3.6 + vTruck;
        double tTruck = xTrack / vTruck;
        double carT = xTrack / carV;

        System.out.printf("The truck arrived after %.0f hours", Math.ceil(tTruck));
        System.out.printf("%n");
        System.out.printf("The car arrived after %.0f hours", Math.ceil(carT));
    }
}
