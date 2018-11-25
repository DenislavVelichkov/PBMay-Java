package s.Exam7and8July2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirdFarm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double eggPrice = Double.parseDouble(reader.readLine());
        double chickenCount = Double.parseDouble(reader.readLine());
        double chickenBoughtSecondMonth = Double.parseDouble(reader.readLine());
        double chickenBoughtThirdMonth = Double.parseDouble(reader.readLine());

        double chickenEggsDuringOneMonth = (30 / 3) * 2;

        double totFirstMonth = chickenCount * chickenEggsDuringOneMonth;
        double totSecMonth = (chickenBoughtSecondMonth + chickenCount) * chickenEggsDuringOneMonth;
        double totThirdMonth = (chickenBoughtThirdMonth + chickenBoughtSecondMonth + chickenCount) * chickenEggsDuringOneMonth;

        double total = totFirstMonth + totSecMonth + totThirdMonth;
        double finalTot = (total * 0.96) * eggPrice;

        System.out.printf("Profit: %.0f Lv.", Math.floor(finalTot));
    }
}
