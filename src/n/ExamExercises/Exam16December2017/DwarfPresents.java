package n.ExamExercises.Exam16December2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DwarfPresents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int dwarfs = Integer.parseInt(reader.readLine());
        int santasMoney = Integer.parseInt(reader.readLine());
        double totMoneyNeeded = 0d;

        double sandClock = 2.20;
        double magnet = 1.50;
        double cup = 5.00;
        double tShirt = 10.00;

        for (int i = 1; i <= dwarfs; i++) {
            String presentsType = reader.readLine();

            switch (presentsType){
                case "sand clock":
                    totMoneyNeeded += sandClock;
                    break;
                case "magnet":
                    totMoneyNeeded += magnet;
                    break;
                case "cup":
                    totMoneyNeeded += cup;
                    break;
                case "t-shirt":
                    totMoneyNeeded += tShirt;
                    break;
                    default:
                        break;
            }
        }
        if (santasMoney < totMoneyNeeded){
            System.out.printf("Santa Claus will need %.2f more leva.", totMoneyNeeded - santasMoney);
        }else {
            System.out.printf("Santa Claus has %.2f more leva left!", santasMoney - totMoneyNeeded);
        }
    }
}
