package ExamExercises_07.Exam10and11March2018;

import java.util.Scanner;

public class SlotMachineVer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstC = scanner.nextLine().charAt(0);
        int firstNum = Integer.parseInt(scanner.nextLine());
        char secondC = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());
        char thirdC = scanner.nextLine().charAt(0);
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int firstL = firstC + firstNum;
        int secondL = secondC + secondNum;
        int thirdL = thirdC + thirdNum;

        String combination = "" + (char) firstL + (char) secondL + (char) thirdL;

        if (combination.equals("777")) {
            System.out.println(combination);
            System.out.println("*** JACKPOT ***");
        } else  if (combination.equals("@@@")) {
            System.out.println(combination);
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        } else {
            System.out.println(combination);
        }
    }
}
