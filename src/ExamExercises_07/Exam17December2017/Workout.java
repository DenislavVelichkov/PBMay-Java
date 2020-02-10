package ExamExercises_07.Exam17December2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Workout {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int days = Integer.parseInt(reader.readLine());
        double distanceRanFirstDay = Double.parseDouble(reader.readLine());

        double totalKmRan = distanceRanFirstDay;
        double distanceRanPreviousDays = distanceRanFirstDay;

        for (int i = 0; i < days; i++) {
            int percentsIncrease = Integer.parseInt(reader.readLine());

            double distanceRanToday = distanceRanPreviousDays + (distanceRanPreviousDays * percentsIncrease / 100);
            totalKmRan += distanceRanToday;

            distanceRanPreviousDays = distanceRanToday;
        }
            if (totalKmRan >= 1000){
                System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKmRan - 1000));
            }else {
                System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKmRan));
            }
    }
}
