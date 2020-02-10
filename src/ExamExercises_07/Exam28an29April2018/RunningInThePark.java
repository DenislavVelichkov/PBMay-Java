package ExamExercises_07.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunningInThePark {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        double totDistance = 0d;
        int totRuntime = 0;
        double burnedCalories = 0d;

        for (int i = 0; i < n; i++) {
            int runTime = Integer.parseInt(reader.readLine());
            double distance = Double.parseDouble(reader.readLine());
            String distType = reader.readLine();

switch (distType){
    case "km":
        totDistance += distance;
        break;
    case "m":
        totDistance += distance / 1000;
        break;
        default:
            break;
}
totRuntime += runTime;

            double burnedCaloriesStep = totRuntime / 5.0;
            burnedCalories = burnedCaloriesStep * 100;
        }
        System.out.printf("He ran %.2fkm for %d minutes and burned %.0f calories.", totDistance, totRuntime, burnedCalories);
    }
}
