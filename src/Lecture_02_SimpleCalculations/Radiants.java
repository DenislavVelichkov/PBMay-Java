package SimpleCalculations_01;

import java.util.Scanner;

public class Radiants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rad=Double.parseDouble(scan.nextLine());
        double deg = (rad * 180) / Math.PI;
        System.out.println(Math.round(deg));
    }
}
