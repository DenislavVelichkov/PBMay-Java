package SimpleCalculations_01;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amount = Double.parseDouble(scan.nextLine());
        amount = amount * 1.79549;
        System.out.printf("%.2f", amount);
    }
}
