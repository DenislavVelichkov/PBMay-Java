package n.ExamExercises.Exam14and15April2018;

import java.util.Scanner;

public class SolarSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        boolean testName = true;
        double distance = 0;
        double totDays = 0;

        if (name.equals("Mercury")) {
            if (days > 7) {
                System.out.println("Invalid number of days!");
                testName = false;
            }
            distance = 2 * 0.61;
            totDays = (2 * 226 * 0.61) + days;
        } else if (name.equals("Venus")) {
            if (days > 14) {
                System.out.println("Invalid number of days!");
                testName = false;
            }
            distance = 2 * 0.28;
            totDays = (2 * 226 * 0.28) + days;
        } else if (name.equals("Mars")) {
            if (days > 20) {
                System.out.println("Invalid number of days!");
                testName = false;
            }
            distance = 2 * 0.52;
            totDays = (2 * 226 * 0.52) + days;
        } else if (name.equals("Jupiter")) {
            if (days > 5) {
                System.out.println("Invalid number of days!");
                testName = false;
            }
            distance = 2 * 4.2;
            totDays = (2 * 226 * 4.2) + days;
        } else if (name.equals("Saturn")) {
            if (days > 3) {
                System.out.println("Invalid number of days!");
                testName = false;
            }
            distance = 2 * 8.52;
            totDays = (2 * 226 * 8.52) + days;
        } else if (name.equals("Uranus")) {
            if (days > 3) {
                System.out.println("Invalid number of days!");
                testName = false;
            }
            distance = 2 * 18.21;
            totDays = (2 * 226 * 18.21) + days;
        } else if (name.equals("Neptune")) {
            if (days > 2) {
                System.out.println("Invalid number of days!");
                testName = false;
            }
            distance = 2 * 29.09;
            totDays = (2 * 226 * 29.09) + days;
        } else {
            System.out.println("Invalid planet name!");
            testName = false;

        }if(testName) {
            System.out.printf("Distance: %.2f%n", distance);
            System.out.printf("Total number of days: %.2f", totDays);
        }


    }
}