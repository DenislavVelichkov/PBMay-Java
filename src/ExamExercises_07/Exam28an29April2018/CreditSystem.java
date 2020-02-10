package ExamExercises_07.Exam28an29April2018;

import java.util.Scanner;

public class CreditSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double totalCredits = 0d;
        double totalGrade = 0d;

        for (int i = 0; i < n; i++) {

            int creditData = Integer.parseInt(scan.nextLine());
            int credits = creditData / 10;
            int grade = creditData % 10;
            double multiplier = 0d;

            switch (grade){
                case 3: // case 2 ne e nujno, zashtoto se podrazbira
                    multiplier = 0.5;
                    break;
                case 4:
                    multiplier = 0.7;
                    break;
                case 5:
                    multiplier = 0.85;
                    break;
                case 6:
                    multiplier = 1;
                    break;
        }
        totalCredits += credits * multiplier;
        totalGrade += grade;
        }
        System.out.printf("%.2f%n", totalCredits);
        System.out.printf("%.2f", totalGrade / n);
    }
}
