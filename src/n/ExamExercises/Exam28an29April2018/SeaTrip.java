package n.ExamExercises.Exam28an29April2018;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double food = Double.parseDouble(scan.nextLine());
        double suv = Double.parseDouble(scan.nextLine());
        double hotel = Double.parseDouble(scan.nextLine());

        double trip = 420 / 100.0 * 7;
        double gas = trip * 1.85;
        double stay = (3 * food) + (3 * suv);

        double day1 = hotel * 0.9;
        double day2 = hotel * 0.85;
        double day3 = hotel * 0.8;
        System.out.printf("Money needed: %.2f", gas + stay + day1 + day2 + day3);
    }
}
