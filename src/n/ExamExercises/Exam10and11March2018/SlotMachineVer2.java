package n.ExamExercises.Exam10and11March2018;

import java.util.Scanner;

public class SlotMachineVer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char n = scan.nextLine().charAt(0);
        int n1 = Integer.parseInt(scan.nextLine());
        char m = scan.nextLine().charAt(0);
        int m1 = Integer.parseInt(scan.nextLine());
        char k = scan.nextLine().charAt(0);
        int k1 = Integer.parseInt(scan.nextLine());

        int sumOfN = n + n1;
        int sumOfM = m + m1;
        int sumOfK = k + k1;

        if (sumOfM == 64 && sumOfN == 64 && sumOfK == 64) {
            System.out.println("@@@");
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        } else if (sumOfM == 55 && sumOfN == 55 && sumOfK == 55) {
            System.out.println("777");
            System.out.println("*** JACKPOT ***");
        } else {
            System.out.printf("%c%c%c", sumOfN, sumOfM, sumOfK);
        }
    }
}
