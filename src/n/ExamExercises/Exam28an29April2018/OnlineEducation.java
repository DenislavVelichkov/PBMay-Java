package n.ExamExercises.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlineEducation {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String fEarly = scan.readLine();
        int sEarly = Integer.parseInt(scan.readLine());
        String fOnTime = scan.readLine();
        int sOnTime = Integer.parseInt(scan.readLine());
        String fLate = scan.readLine();
        int sLate = Integer.parseInt(scan.readLine());

        int studentsOnline = 0;
        int studentsOffline = 0;

        if (fEarly.equals("onsite")) {
            studentsOffline += sEarly;
        }else {
            studentsOnline += sEarly;
        }
            if (fOnTime.equals("onsite")) {
                studentsOffline += sOnTime;
            }else{
                studentsOnline +=sOnTime;
            }
                if (fLate.equals("onsite")) {
                    studentsOffline += sLate;
                } else {
                    studentsOnline += sLate;
                }
        if (studentsOffline > 600){
            int studentsLeft = studentsOffline - 600;
                    studentsOnline += studentsLeft;
                    studentsOffline = 600;
        }
        System.out.printf("Online students: %d%n", studentsOnline);
        System.out.printf("Onsite students: %d%n", studentsOffline);
        System.out.printf("Total students: %d", studentsOnline + studentsOffline);
    }
}
