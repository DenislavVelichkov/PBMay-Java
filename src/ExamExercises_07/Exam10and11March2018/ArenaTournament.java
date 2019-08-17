package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArenaTournament {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int points = Integer.parseInt(scan.readLine());
        String arenaName = scan.readLine();
        String day = scan.readLine();
        String type = scan.readLine();

        int itemsPrice;
        double singleItemPrice = 0;


        switch (type) {
            case "Poor":
                itemsPrice = 7000;

                break;
            case "Normal":
                itemsPrice = 14000;

                break;
            default:
                itemsPrice = 21000;
                break;
        }

        switch (arenaName) {

            case "Nagrand":

                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")) {

                    itemsPrice *= 0.95;
                    singleItemPrice = itemsPrice / 5;

                }else {

                    singleItemPrice = itemsPrice / 5;

                }
                break;

            case "Gurubashi":

                if (day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")) {

                    itemsPrice *= 0.9;
                    singleItemPrice = itemsPrice / 5;

                }else {

                    singleItemPrice = itemsPrice / 5;

                }
                break;

            case "Dire Maul":

                if (day.equals("Friday") || day.equals("Saturday")) {

                    itemsPrice *= 0.93;
                    singleItemPrice = itemsPrice / 5;

                }else {

                    singleItemPrice = itemsPrice / 5;
                }
                break;
        }

        int successfulPurchase = 0;

        for (int count = 1; count <= 5 && points >= singleItemPrice; count++) {

            points -= singleItemPrice;
            successfulPurchase++;
        }

        if (successfulPurchase == 5) {

            System.out.printf("Items bought: %d%n", successfulPurchase);
            System.out.printf("Arena points left: %d%n", points);
            System.out.println("Success!");

        } else {
            System.out.printf("Items bought: %d%n", successfulPurchase);
            System.out.printf("Arena points left: %d%n", points);
            System.out.println("Failure!");

        }
    }
}

