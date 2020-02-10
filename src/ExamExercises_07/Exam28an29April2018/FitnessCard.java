package ExamExercises_07.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FitnessCard {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double money = Double.parseDouble(scan.readLine());
        String gender = scan.readLine();
        int age = Integer.parseInt(scan.readLine());
        String sport = scan.readLine();

        double cardPrice = 0;

        if (gender.equals("m")) {
            switch (sport) {
            case "Gym":
                cardPrice = 42;
                break;
            case "Boxing":
                cardPrice = 41;
                break;
            case "Yoga":
                cardPrice = 45;
                break;
            case "Zumba":
                cardPrice = 34;
                break;
            case "Dances":
                cardPrice = 51;
                break;
            case "Pilates":
                cardPrice = 39;
                break;
        }
        }else {
            switch (sport) {
                case "Gym":
                    cardPrice = 35;
                    break;
                case "Boxing":
                    cardPrice = 37;
                    break;
                case "Yoga":
                    cardPrice = 42;
                    break;
                case "Zumba":
                    cardPrice = 31;
                    break;
                case "Dances":
                    cardPrice = 53;
                    break;
                case "Pilates":
                    cardPrice = 37;
                    break;
            }
        } if (age <= 19) {
            cardPrice *= 0.80;
        }
            if (money < cardPrice){
                double  reqMoney = Math.abs(cardPrice - money);
                System.out.printf("You don't have enough money! You need $%.2f more.", reqMoney);
            }else
                System.out.printf("You purchased a 1 month pass for %s.", sport);

    }
}
