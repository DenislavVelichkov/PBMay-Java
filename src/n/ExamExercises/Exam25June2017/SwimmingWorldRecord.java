package n.ExamExercises.Exam25June2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwimmingWorldRecord {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double record = Double.parseDouble(scan.readLine());
        double distanceM = Double.parseDouble(scan.readLine());
        double time = Double.parseDouble(scan.readLine());

        double ivTime = (distanceM * time) + (Math.floor(distanceM / 15.0) * 12.5);

        if (ivTime >= record){
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivTime - record);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivTime);
        }
    }
}
