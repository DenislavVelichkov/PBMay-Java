package ExamExercises_07.Exam14and15April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cellphones {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int budget = Integer.parseInt(scan.readLine());
        int quantity = Integer.parseInt(scan.readLine());
        String brand = scan.readLine();

        double totPrice;
        double discount = 0;
        double cellPrice = 0;

        if (quantity > 10 && quantity <= 20) {
            discount = 0.98;

        } else if (quantity > 20 && quantity <= 50) {
            discount = 0.95;

        } else if (quantity > 50) {
            discount = 0.93;
        } else {
            discount = 1;
        }
        switch (brand) {

            case "Gsm4e":
                discount -= 0.01;
                cellPrice = 20.50 * Math.abs(discount);
                break;

            case "Mobifon4e":
                discount -= 0.02;
                cellPrice = 50.75 * Math.abs(discount);
                break;

            case "Telefon4e":
                discount -= 0.03;
                cellPrice = 115 * Math.abs(discount);
                break;
        }

        totPrice = cellPrice * quantity;

        if (totPrice <= budget){

            double diff = budget - totPrice;
            System.out.printf("The company bought all mobile phones. %.2f leva left.", diff);

        }else {

            double diff = budget - totPrice;
            System.out.printf("Not enough money for all mobiles. Company needs %.2f more leva.", Math.abs(diff));
        }
    }
}

