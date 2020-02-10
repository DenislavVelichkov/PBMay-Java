package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hearthstone {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int breakTime = Integer.parseInt(scan.readLine());
        double  packPrice = Double.parseDouble(scan.readLine());
        double  conquestPrice = Double.parseDouble(scan.readLine());
        double  coffeePrice = Double.parseDouble(scan.readLine());

        double restTime = (breakTime - 5) - (3 * 2 + 2 * 2);
        double moneySpendP = 3 * packPrice;
        double moneySpendQ = 2 * conquestPrice;
        double totMoneySpend = moneySpendP + moneySpendQ + coffeePrice;

        System.out.printf("%.2f%n", totMoneySpend);
        System.out.printf("%d", (int)restTime);
    }
}
