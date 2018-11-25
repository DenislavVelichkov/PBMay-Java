package n.ExamExercises.Exam23July2017;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double l = Double.parseDouble(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());
        double a = Double.parseDouble(scan.nextLine());

        double hall = (l * 100) * (w * 100);
        double drope = (a * 100) * (a * 100);

        double bench = hall / 10;
        double space = hall - drope - bench;
        double dancers = space / (40 + 7000);

        Math.floor(dancers);
        Integer d = (int) dancers;
        System.out.println(d);
    }
}
