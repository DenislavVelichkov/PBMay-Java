package SimpleCalculations_01;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble((scan.nextLine()));
        double area;
        area = (x * h) / 2;
        System.out.printf("Triangle area = %.2f", area);
    }
}
