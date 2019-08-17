package ExamExercises_07.Exam07May2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToyStore {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double hollydayPrice = Double.parseDouble(scan.readLine());
        double puzzleCount = Double.parseDouble(scan.readLine());
        double talkDolls = Double.parseDouble(scan.readLine());
        double gBears = Double.parseDouble(scan.readLine());
        double minions = Double.parseDouble(scan.readLine());
        double trucks = Double.parseDouble(scan.readLine());

        double totSell = puzzleCount * 2.60 + talkDolls * 3 + gBears * 4.10 +  minions * 8.20 + trucks * 2.00;
        double toysCount = puzzleCount + talkDolls + gBears + minions + trucks;

        if (toysCount < 50){

            double profit = totSell - totSell * 0.10;

            if (profit > hollydayPrice ) {

                System.out.printf("Yes! %.2f lv left.", profit - hollydayPrice);
            }else {

                System.out.printf("Not enough money! %.2f lv needed.", Math.abs(profit - hollydayPrice));
            }

            }else {

            double discount = totSell * 0.25;
            double totPrice = totSell - discount;
            double profit1 = totPrice - totPrice * 0.10;

            if (profit1 > hollydayPrice ) {
                System.out.printf("Yes! %.2f lv left.", Math.abs(profit1 - hollydayPrice));
            }else {
                System.out.printf("Not enough money! %.2f lv needed.", Math.abs(profit1 - hollydayPrice));
            }
        }
    }
}
