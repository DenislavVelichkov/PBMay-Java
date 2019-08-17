package ExamExercises_07.Exam14and15April2018;

import java.util.Scanner;

public class CherryJars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int komjar = Integer.parseInt(scan.nextLine());
        int chjar = Integer.parseInt(scan.nextLine());

        double komreq = 0.3;
        double chreq = 0.65;
        double kiprice = 3.20;

        int totkomjars = komjar + 1;
        int totchjar = chjar + 1;
        double komamount = (totkomjars * komreq) * 1.05;
        double chamount = (totchjar * chreq) * 1.1;

        double totcost = komamount + chamount;
        double totprice = totcost * kiprice;

        System.out.printf("%.2f",totprice);
    }
}
