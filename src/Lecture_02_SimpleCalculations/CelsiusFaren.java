package b.SimpleCalculations;

import java.util.Scanner;

public class CelsiusFaren {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cel = Double.parseDouble(scan.nextLine());
        double conv = (cel * 1.8 + 32);
        System.out.printf("%.2f",conv);
    }
}
