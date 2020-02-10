package ExamExercises_07.Exam14and15April2018;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gpuprice = Integer.parseInt(scan.nextLine());
        int crprice = Integer.parseInt(scan.nextLine());
        double powercn = Double.parseDouble(scan.nextLine());
        double profit = Double.parseDouble(scan.nextLine());

        int gpucost = (gpuprice * 13) + (crprice * 13) + 1000;
        double profit2 = profit - powercn;
        double totprofit = 13 * profit2;
        double roi = gpucost / totprofit;

        System.out.println(gpucost);
        System.out.println((int)Math.ceil(roi));

    }
}
