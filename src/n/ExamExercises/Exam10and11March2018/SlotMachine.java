package n.ExamExercises.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SlotMachine {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        char n = (char)scan.read();
        scan.readLine();
        int a = Integer.parseInt(scan.readLine());
        char y = (char)scan.read();
        scan.readLine();
        int b = Integer.valueOf(scan.readLine());
        char x = (char)scan.read();
        scan.readLine();
        int c = Integer.valueOf(scan.readLine());

        int k1 = (int) n + a;
        int k2 = (int) y + b;
        int k3 = (int) x + c;

        char f1 = (char) k1;
        char f2 = (char) k2;
        char f3 = (char) k3;

        System.out.printf("%s%s%s%n", f1, f2, f3);

        if (f1 == '7' && f2 == '7' && f3 == '7') {

            System.out.println("*** JACKPOT ***");

        } else if (f1 == '@' && f2 == '@' && f3 == '@'){

            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        }
    }
}