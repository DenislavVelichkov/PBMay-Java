package s.Exam7and8July2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Results {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String courseType = reader.readLine();
        int studentsCount = Integer.parseInt(reader.readLine());

        int countWeak = 0;
        int countExcellent = 0;
        double avgScore = 0;
        double totStudentsScore = 0;

        for (int i = 1; i <= studentsCount; i++) {
            double studentScore = Double.parseDouble(reader.readLine());

            if (studentScore < 3.00) {
                studentScore = 2.00;

                totStudentsScore += studentScore;
                countWeak++;

            } else if (studentScore >= 5.50) {
                if (studentScore > 6.00) {
                    studentScore = 6.00;
                }

                countExcellent++;
                totStudentsScore += studentScore;

            } else {
                totStudentsScore += studentScore;
            }

        }
        switch (courseType) {
            case "Programming basics":
                avgScore = (totStudentsScore / studentsCount) + 0.3;
                break;
            case "Photoshop basics":
                avgScore = (totStudentsScore / studentsCount) + 0.2;
                break;
            case "AdWords basics":
                avgScore = (totStudentsScore / studentsCount) + 0.4;
                break;

            default:
                System.out.printf("%s is invalid course name!", courseType);
                return;
        }
        if (avgScore > 6.00) {
            avgScore = 6.00;
        }
        System.out.printf("%s average score: %.2f%nWeak results: %d%nExcellent results: %d", courseType, avgScore, countWeak, countExcellent);
    }
}
