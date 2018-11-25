package n.ExamExercises.Exam26March2016;

import java.util.Scanner;

public class DivideWithoutRest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        int countNum1 = 0;
        int countNum2 = 0;
        int countNum3 = 0;

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scan.nextLine());

            if (num % 2 == 0) {
                countNum1++;
                if (num % 4 == 0) {
                    countNum3++;
                    if (num % 3 == 0) {
                        countNum2++;
                        continue;
                    }
                }
            }
            if (num % 3 == 0) {
                countNum2++;
            }
        }

                double p1 = (countNum1 / n) * 100;
                double p2 = (countNum2 / n) * 100;
                double p3 = (countNum3 / n) * 100;

                System.out.printf("%.2f%%%n", p1);
                System.out.printf("%.2f%%%n", p2);
                System.out.printf("%.2f%%%n", p3);

            }
        }

