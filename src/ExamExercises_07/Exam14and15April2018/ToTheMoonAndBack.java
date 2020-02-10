package ExamExercises_07.Exam14and15April2018;

import java.util.Scanner;

public class ToTheMoonAndBack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double avgspeed = Double.parseDouble(scan.nextLine());
        double reqfuel = Double.parseDouble(scan.nextLine());

        int distance = 384400;
        int tottrip = distance * 2;

        double time = Math.ceil(tottrip / avgspeed);

        double tottime = time + 3;
        double fuel = (reqfuel * tottrip / 100);
        System.out.printf("%.0f%n", tottime);
        System.out.println((int)fuel);
    }
}
