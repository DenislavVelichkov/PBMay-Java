package ExamExercises_07.Exam6March2016;

import java.util.Scanner;

public class Chistogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int numCount1 = 0;
        int numCount2 = 0;
        int numCount3 = 0;
        int numCount4 = 0;
        int numCount5 = 0;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < 200){
                numCount1++;

            }else if (num <= 399){
                numCount2++;

            }else if (num <= 599){
                numCount3++;

            }else if (num <= 799){
                numCount4++;

            }else {
                numCount5++;

            }

        }
        double p = numCount1 + numCount2 + numCount3 + numCount4 + numCount5;
        double p1 = numCount1 / p * 100;
        double p2 = numCount2 / p * 100;
        double p3 = numCount3 / p * 100;
        double p4 = numCount4 / p * 100;
        double p5 = numCount5 / p * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
