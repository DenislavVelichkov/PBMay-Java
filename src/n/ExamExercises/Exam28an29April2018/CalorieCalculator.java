package n.ExamExercises.Exam28an29April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalorieCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String gender = scan.readLine();
        double weight = Double.parseDouble(scan.readLine());
        double height = Double.parseDouble(scan.readLine());
        int age = Integer.parseInt(scan.readLine());
        String fActivity = scan.readLine();

        double calories = 0;
        double BNM = 0;

        if (gender.equalsIgnoreCase("m")) {

            BNM = 66 + (13.7 * weight) + (5 * height * 100) - (6.8 * age);

            if (fActivity.equalsIgnoreCase("sedentary")) {
                calories = BNM * 1.2;

            } else if (fActivity.equalsIgnoreCase("lightly active")) {

                calories = BNM * 1.375;

            } else if (fActivity.equalsIgnoreCase("moderately active")) {

                calories = BNM * 1.55;

            } else if (fActivity.equalsIgnoreCase("very active")) {

                calories = BNM * 1.725;
            }
        }
        if (gender.equalsIgnoreCase("f/DrawingFigures")){

            BNM = 655 + (9.6 * weight) + (1.8 * height * 100) - (4.7 * age);

            if (fActivity.equalsIgnoreCase("sedentary")) {
                calories = BNM * 1.2;

            } else if (fActivity.equalsIgnoreCase("lightly active")) {

                calories = BNM * 1.375;

            } else if (fActivity.equalsIgnoreCase("moderately active")) {

                calories = BNM * 1.55;

            } else if (fActivity.equalsIgnoreCase("very active")) {

                calories = BNM * 1.725;
            }
        }
        System.out.printf("To maintain your current weight you will need %.0f calories per day.", Math.ceil(calories));
    }
}
