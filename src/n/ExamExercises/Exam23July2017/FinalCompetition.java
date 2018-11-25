package n.ExamExercises.Exam23July2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalCompetition {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int dancers = Integer.parseInt(reader.readLine());
        double points = Double.parseDouble(reader.readLine());
        String season = reader.readLine();
        String place = reader.readLine();

        double priceMoney = 0;
        double price = 0;

        switch (place) {
            case "Bulgaria":
                priceMoney = points * dancers;

                switch (season) {
                    case "summer":
                        priceMoney -= priceMoney * 0.05;
                        break;
                    case "winter":
                        priceMoney -= priceMoney * 0.08;
                        break;
                }
                break;
            case "Abroad":
                price = dancers * points;
                priceMoney = price + (price * 0.5);

                switch (season) {
                    case "summer":
                        priceMoney -= priceMoney * 0.1;
                        break;
                    case "winter":
                        priceMoney -= priceMoney * 0.15;
                        break;
                }
                break;
        }
            double charity = priceMoney * 0.75;
            double payRoll = (priceMoney - charity) / dancers;

            System.out.printf("Charity - %.2f%n", charity);
            System.out.printf("Money per dancer - %.2f", payRoll);

    }
}
