package ExamExercises_07.Exam24April2016;

import java.util.Scanner;

public class SmartLili {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double washingMachinePrice = Double.parseDouble(scan.nextLine());
        double toyPrice = Double.parseDouble(scan.nextLine());

        double money = 0d;
        int countToys = 0;
        double age = 0d;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            age++;

            if (age % 2 == 0){
                count++;

                money += count * 10.00;
            }else {
                countToys++;
            }
        }
        double profit = countToys * toyPrice;
        double totSavings =profit + (money - count);

        if (totSavings >= washingMachinePrice){

            System.out.printf("Yes! %.2f", totSavings - washingMachinePrice);
        }else {
            System.out.printf("No! %.2f", washingMachinePrice - totSavings);
        }
    }
}
