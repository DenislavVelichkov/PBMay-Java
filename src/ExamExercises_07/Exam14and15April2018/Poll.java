package ExamExercises_07.Exam14and15April2018;

import java.util.Scanner;

public class Poll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int participants = Integer.parseInt(scan.nextLine());
        int voters = Integer.parseInt(scan.nextLine());

        double sndPlace = voters - (voters * 0.2);
        double thirdPlace = sndPlace - (sndPlace * 0.1);


        double half = participants / 2;
        double sum = Math.floor(((voters + sndPlace + thirdPlace) - half));

        if (sum >= 0){
            System.out.printf("First three languages have %.0f votes more",sum);
        }else
            System.out.printf("First three languages have %.0f votes less of half votes", Math.abs(sum));

    }
}
