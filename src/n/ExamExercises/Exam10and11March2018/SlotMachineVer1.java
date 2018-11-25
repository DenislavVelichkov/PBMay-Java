package n.ExamExercises.Exam10and11March2018;

import java.util.Scanner;

public class SlotMachineVer1 {
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

                String charsAsString = String.format("%c%c%c", sumOfN, sumOfM, sumOfK);

                if (charsAsString.equals("@@@")) {
                    System.out.println(charsAsString);
                    System.out.println("!!! YOU LOSE EVERYTHING !!!");
                } else if (charsAsString.equals("777")) {
                    System.out.println(charsAsString);
                    System.out.println("*** JACKPOT ***");
                } else {
                    System.out.println(charsAsString);
                }
            }
        }
