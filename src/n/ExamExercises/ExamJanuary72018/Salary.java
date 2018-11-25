package n.ExamExercises.ExamJanuary72018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double basicSalary = Double.parseDouble(reader.readLine());
        int timeServed = Integer.parseInt(reader.readLine());
        String isASyndicateMember = reader.readLine();

        int yearsToMaxSalary = 0;
        double currentSalary = basicSalary;

        if (isASyndicateMember.equals("Yes")) {
            for (int i = 1; i <= timeServed; i++) {

                currentSalary += currentSalary * 0.05;


                if (i % 10 == 0) {
                    currentSalary += 200;

                } else if (i % 5 == 0) {
                    currentSalary += 100;

                }
                if (currentSalary >= 5000) {
                    currentSalary = 5000.00;
                    break;
                }
            }

        } else {
            for (int i = 1; i <= timeServed; i++) {

                currentSalary += currentSalary * 0.06;


                if (i % 10 == 0) {
                    currentSalary += 200;

                } else if (i % 5 == 0) {
                    currentSalary += 100;
                }
                if (currentSalary >= 5000) {
                    currentSalary = 5000.00;
                    break;
                }
            }

        }
        System.out.printf("Current salary: %.2f%n", currentSalary);

        currentSalary = basicSalary;

        for (int j = 1; j <= 45; j++) {

            if (isASyndicateMember.equals("Yes")) {

                currentSalary += currentSalary * 0.05;

                if (j % 10 == 0) {
                    currentSalary += 200;

                } else if (j % 5 == 0) {
                    currentSalary += 100;
                }
                if (currentSalary >= 5000) {
                    currentSalary = 5000.00;
                    break;
                }
            } else {

                currentSalary += currentSalary * 0.06;

                if (j % 10 == 0) {
                    currentSalary += 200;

                } else if (j % 5 == 0) {
                    currentSalary += 100;
                }
                if (currentSalary >= 5000) {
                    currentSalary = 5000.00;
                    break;

                }
                yearsToMaxSalary = j;
            }
        }
        if (yearsToMaxSalary >= timeServed) {
            System.out.printf("%d more years to max salary.", yearsToMaxSalary - timeServed);
        }else {
            System.out.println("0 more years to max salary.");
        }
    }
}
