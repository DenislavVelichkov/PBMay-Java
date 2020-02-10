package ExamExercises_07.Exam03September2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TailorFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tables = Integer.parseInt(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double widht = Double.parseDouble(scan.nextLine());

        double covers = tables * (lenght + 2 * 0.30) * (widht + 2 * 0.30);
        double daimonds = tables * (lenght / 2) * (lenght / 2);
        double priceusd = covers * 7 + daimonds * 9;
        double pricebgn = priceusd * 1.85;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println(df.format(priceusd) + " USD");
        System.out.println(df.format(pricebgn) + " BGN");

    }
}
