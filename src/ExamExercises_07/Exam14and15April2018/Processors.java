package ExamExercises_07.Exam14and15April2018;

import java.util.Scanner;

public class Processors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpuCount = Integer.parseInt(scan.nextLine());
        int employees = Integer.parseInt(scan.nextLine());
        int workingDays = Integer.parseInt(scan.nextLine());

        int timeTot = employees * workingDays * 8;
        int eff = (int) Math.floor(timeTot / 3);
        int compare = cpuCount - eff;

        if (eff < cpuCount){
            System.out.printf("Losses: -> %.2f BGN", compare * 110.10);
        }else{
            System.out.printf("Profit: -> %.2f BGN", Math.negateExact(compare) * 110.10);
        }

    }
}
