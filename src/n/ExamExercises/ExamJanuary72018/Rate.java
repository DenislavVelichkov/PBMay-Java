package n.ExamExercises.ExamJanuary72018;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double initialSum = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());

        double simpleSum = initialSum;
        double complexSum = initialSum;

        for (int i = 0; i < months; i++) {
            simpleSum += initialSum * 0.03;
            complexSum += complexSum * 0.027;

        }

        System.out.printf("Simple interest rate: %.2f lv.%n", simpleSum);
        System.out.printf("Complex interest rate: %.2f lv.%n", complexSum);

        if (simpleSum > complexSum){
            System.out.printf("Choose a simple interest rate. You will win %.2f lv.", simpleSum - complexSum);
        }else {
            System.out.printf("Choose a complex interest rate. You will win %.2f lv.", complexSum - simpleSum);
        }
    }
}
