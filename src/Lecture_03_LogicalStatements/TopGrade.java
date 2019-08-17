package Lecture_03_LogicalStatements;

import java.util.Scanner;

public class TopGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 5.5) {
            System.out.println("Excellent!");
        }

    }
}
