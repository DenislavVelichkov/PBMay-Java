package n.ExamExercises.Exam26March2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trip {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(reader.readLine());
        String season = reader.readLine();

        if (budget <= 100) {
            switch (season) {
                case "summer":
                    budget *= 0.3;
                    break;

                case "winter":
                    budget *= 0.7;
                    break;
                default:
                    break;
            }
            if (season.equals("summer")){
                season = "Camp";
            }else {
                season = "Hotel";
            }
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("%s - %.2f", season, budget);

        } else if (budget <= 1000) {
            switch (season) {
                case "summer":
                    budget *= 0.4;
                    break;

                case "winter":
                    budget *= 0.8;
                    break;
                default:
                    break;
            }
            if (season.equals("summer")){
                season = "Camp";
            }else {
                season = "Hotel";
            }
            System.out.println("Somewhere in Balkans");
            System.out.printf("%s - %.2f", season, budget);
        } else {
           budget *= 0.9;
            season = "Hotel";
            System.out.println("Somewhere in Europe");
            System.out.printf("%s - %.2f", season, budget);
            }

    }
}