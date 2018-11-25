package n.ExamExercises.Exam23July2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Choreography {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double steps = Double.parseDouble(scan.readLine());
        double dancers = Double.parseDouble(scan.readLine());
        double daysForStudy = Double.parseDouble(scan.readLine());

        Double stepsPerDay = Math.ceil(steps / daysForStudy / steps * 100);
        Double stepsPerDancer = (stepsPerDay / dancers);

        DecimalFormat df = new DecimalFormat("0.00");

        if (stepsPerDay <= 13){

            System.out.println("Yes, they will succeed in that goal! " + df.format(stepsPerDancer) + "%.");
        }else
            System.out.println("No, They will not succeed in that goal! Required " + df.format(stepsPerDancer)
                    + "%" + " steps to be learned per day.");
    }
}
