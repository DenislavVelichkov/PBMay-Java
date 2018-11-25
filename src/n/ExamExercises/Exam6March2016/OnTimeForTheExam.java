package n.ExamExercises.Exam6March2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnTimeForTheExam {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int examHour = Integer.parseInt(reader.readLine());
        int examMinutes = Integer.parseInt(reader.readLine());
        int arrivalHour = Integer.parseInt(reader.readLine());
        int arrivalMinutes = Integer.parseInt(reader.readLine());

        int examTotalMinutes = examHour * 60 + examMinutes;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinutes;

        int difference = examTotalMinutes - arrivalTotalMinutes;
        if (difference > 30) {
            System.out.println("Early");

            if (difference > 59) {
                int hours = difference / 60;
                int minutes = difference % 60;
// Prints 0 infront of 2nd digit if its < 10
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (difference < 0) {
            System.out.println("Late");
            int minutesLate = Math.abs(difference);

            if (minutesLate > 59) {
                int hours = minutesLate / 60;
                int minutes = minutesLate % 60;

                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", minutesLate);
            }

        } else { System.out.println("On time");if (difference > 0) System.out.printf("%d minutes before the start", difference);
        }
    }
}
