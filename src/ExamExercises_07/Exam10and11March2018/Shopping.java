package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shopping {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(scan.readLine());
        int nShoko = Integer.parseInt(scan.readLine());
        double nMilk = Double.parseDouble(scan.readLine());

        double shokoPrice = nShoko * 0.65;
        double milkPrice = nMilk * 2.7;
        double mandQ = Math.floor(nShoko * 0.65);
        double mandPrice =mandQ * 0.20;
        double totPrice = shokoPrice + milkPrice + mandPrice;
        double diff = budget - totPrice;

        if (budget >= totPrice){

            System.out.printf("You got this, %.2f money left!", diff);
        }else {

            System.out.printf("Not enough money, you need %.2f more!", Math.abs(diff));
        }
    }
}
