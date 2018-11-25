package s.Exam7and8July2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BraceletStand {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double pocketMoney = Double.parseDouble(reader.readLine());
        double dailyProfit = Double.parseDouble(reader.readLine());
        double expenses = Double.parseDouble(reader.readLine());
        double presentCost = Double.parseDouble(reader.readLine());

        double totMoney = 5 * pocketMoney + 5 * dailyProfit;
        double totExpenses = totMoney - expenses;

        if (totExpenses >= presentCost){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totExpenses);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.", presentCost - totExpenses);
        }
    }
}
