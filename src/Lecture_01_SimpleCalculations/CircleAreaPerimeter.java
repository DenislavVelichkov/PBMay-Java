package Lecture_01_SimpleCalculations;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  r = Double.parseDouble(scanner.nextLine());
        System.out.println("Area= " + Math.PI * r * r);
        System.out.println("Perimete= " + 2 * Math.PI * r);
    }
}
