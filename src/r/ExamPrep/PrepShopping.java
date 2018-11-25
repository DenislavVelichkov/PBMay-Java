package r.ExamPrep;

import f.DrawingFigures.SquareFrame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrepShopping {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(reader.readLine());
        double chocolatesCount = Double.parseDouble(reader.readLine());
        double milkLiters = Double.parseDouble(reader.readLine());

        double chocolatesCost = chocolatesCount * 0.65;
        double milkCost = milkLiters * 2.7;
        double mandarinCount = Math.floor(chocolatesCount - chocolatesCount * 0.35);
        double mandarinCost = mandarinCount * 0.2;
        double totalCost = chocolatesCost + milkCost + mandarinCount;
        double difference = Math.abs(budget - totalCost);

        if (budget >= totalCost){

            System.out.printf("You got this, %.2f money left!", difference);
        }else {
            System.out.printf("Not enough money, you need %.2f more!", difference);
        }
    }
}
