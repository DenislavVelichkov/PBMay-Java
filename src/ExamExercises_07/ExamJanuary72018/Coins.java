package ExamExercises_07.ExamJanuary72018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coins {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double change = Double.parseDouble(reader.readLine());

        int moneyRepInt = (int) (change * 100);// Money , change
        int counter = 0;

        while (moneyRepInt > 0){
            if (moneyRepInt >= 200){
                counter++;
                moneyRepInt -= 200;

            }else if (moneyRepInt >= 100){
                counter++;
                moneyRepInt -= 100;

            }else if (moneyRepInt >= 50){
                counter++;
                moneyRepInt -= 50;

            }else if (moneyRepInt >= 20){
                counter++;
                moneyRepInt -= 20;

            }else if (moneyRepInt >= 10){
                counter++;
                moneyRepInt -= 10;

            }else if (moneyRepInt >= 5){
                counter++;
                moneyRepInt -= 5;

            }else if (moneyRepInt >= 2){
                counter++;
                moneyRepInt -= 2;

            }else {
                counter++;
                moneyRepInt -= 1;

            }
        }
        System.out.print(counter);
    }
}
