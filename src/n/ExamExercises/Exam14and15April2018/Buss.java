package n.ExamExercises.Exam14and15April2018;

import java.util.Scanner;

public class Buss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int passengers = Integer.parseInt(scan.nextLine());
        int stops = Integer.parseInt(scan.nextLine());



        for (int i = 1; i <= stops; i++) {
            int newPassengersOut = Integer.parseInt(scan.nextLine());
            int newPassengersIn = Integer.parseInt(scan.nextLine());


                if (i % 2 == 0){
                    passengers = (passengers - newPassengersOut) + (newPassengersIn - 2);

                }else {
                    passengers =(passengers - newPassengersOut) + (newPassengersIn + 2);
                }
        }
        System.out.printf("The final number of passengers is : %d", passengers);
    }
}
