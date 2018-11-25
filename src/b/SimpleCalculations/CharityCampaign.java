package b.SimpleCalculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int cooks = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int gof = Integer.parseInt(scan.nextLine());
        int pencakes = Integer.parseInt(scan.nextLine());

        double normc = cakes * 45;
        double normgof = gof * 5.80;
        double normpc = pencakes * 3.20;

        double sumday = (normc + normgof + normpc) * cooks;
        double sumcamp = sumday * days;
        double expenses = sumcamp - (sumcamp * 1 / 8);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(expenses));
    }

}
