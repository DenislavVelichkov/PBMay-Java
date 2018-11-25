package n.ExamExercises.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Balls {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(reader.readLine());

    int totalPoints = 0;
    double pointsForRed = 0d;
    double pointsForOrange = 0d;
    double pointsForYellow = 0d;
    double pointsForWhite = 0d;
    double pointsForOther = 0d;
    double dividesFromBlack = 0d;

        for (int i = 0; i < n; i++) {
            String color = reader.readLine();
            switch (color){
                case "red":
                    totalPoints += 5;
                    pointsForRed++;
                    break;
                case "orange":
                    totalPoints += 10;
                    pointsForOrange++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    pointsForYellow++;
                    break;
                case "white":
                    totalPoints += 20;
                    pointsForWhite++;
                    break;
                case "black":
                    totalPoints /= 2;
                    dividesFromBlack++;
                    break;

                    default:
                        pointsForOther++;
                        break;
            }
        }

        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Points from red balls: %.0f%n", pointsForRed);
        System.out.printf("Points from orange balls: %.0f%n", pointsForOrange);
        System.out.printf("Points from yellow balls: %.0f%n", pointsForYellow);
        System.out.printf("Points from white balls: %.0f%n", pointsForWhite);
        System.out.printf("Other colors picked: %.0f%n", pointsForOther);
        System.out.printf("Divides from black balls: %.0f", dividesFromBlack);
    }
}
